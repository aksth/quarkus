package org.akash;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
@RegisterRestClient
@Path("/")
public interface IgaApiRestClient {

    /*@POST
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/{cprnumber}/finger/verify")
    ResultVerificationResponse fingerPrintVerification(@HeaderParam("x-api-key") String xApiKey,
                                                       @HeaderParam("req-timestamp") String reqTimestamp,
                                                       @HeaderParam("transaction-type") String transactionType,
                                                       @HeaderParam("content-type") String contentType,
                                                       @PathParam("cprnumber") String cprnumber,
                                                       InputStream requestBody);*/

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/finger/verifytest")
    CompletionStage<ResultVerificationResponse> fingerPrintVerificationTest();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/finger/verifytest")
    Uni<ResultVerificationResponse> fingerPrintVerificationTestUni();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hmac/verify")
    ResultVerificationResponse resultVerification(@HeaderParam("x-api-key") String xApiKey,
                                                  @HeaderParam("req-timestamp") String reqTimestamp,
                                                  ResultVerificationRequest requestBody);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/ekyc")
    PersonInfo getPersonInfo(@HeaderParam("x-api-key") String xApiKey,
                             @QueryParam("idNumber") String idNumber,
                             @QueryParam("cardCountry") String cardCountry,
                             @QueryParam("clientTimestamp") String clientTimestamp);

}