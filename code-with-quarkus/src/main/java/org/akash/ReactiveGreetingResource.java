package org.akash;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.akash.ReactiveGreetingService;
import org.apache.commons.io.input.NullInputStream;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.concurrent.CompletionStage;

@Path("/reactive")
public class ReactiveGreetingResource {

    @Inject
    ReactiveGreetingService service;

    @Inject
    @RestClient
    IgaApiRestClient igaApiRestClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public Uni<String> greeting(@PathParam("name") String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/greeting/{count}/{name}")
    public Multi<String> greetings(@PathParam("count") int count, @PathParam("name") String name) {
        return service.greetings(count, name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Path("/createcase")
    public Response createCase()
            throws NotFoundException {

        CompletionStage completionStage = igaApiRestClient.fingerPrintVerificationTest();

        Uni uni = igaApiRestClient.fingerPrintVerificationTestUni();

        completionStage.thenApply(t -> {
            System.out.println("Response received!!");
            return "Response Received";
        });

        uni.subscribe().with(
                result -> System.out.println("Uni response received."),
                failure -> System.out.println("Uni failure.")
        );

        Multi<String> multi = service.greetings(10, "Akash");
        multi.subscribe().with(
            item -> System.out.println(item),
            failure -> System.out.println("Multi Item failure.")
        );

        return Response.status(Response.Status.CREATED).build();

    }

    /*@GET
    @Produces({ "application/json" })
    @Path("/test")
    public ModelCase getTest(){
        ModelCase modelCase = new ModelCase();
        modelCase.setId("123");
        return modelCase;
    }*/
}