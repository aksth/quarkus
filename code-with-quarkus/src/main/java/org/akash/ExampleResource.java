package org.akash;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.akash.soapclient.CustomField;
import org.akash.soapclient.Group;
import org.akash.soapclient.TemplateObject;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.ArrayList;
import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    GreetingServiceInterface service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(@PathParam String name){
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting2/")
    public String greeting2(@QueryParam("name") String name){
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "hello, how're you? How fast will this update?";
    }

    @POST
    @Path("/test")
    public Person test(Person person) {
        Person p = new Person();
        p.setAddress("Shankhamul");
        p.setName("Akash");
        p.setId(12L);
        return p;
    }

    @GET
    @Path("/testobjectwitharray")
    public TemplateObject testobjectwitharray() {
        /*Group g = new Group("adf23-374jdsh-dkfj");
        List list = new ArrayList<Group>();
        list.add(g);
        list.add(g);
        list.add(g);
        return list;*/
        TemplateObject templateObject =new TemplateObject();
        CustomField c1 = new CustomField();
        c1.setTypeId("c1");
        c1.setValue("v1");
        CustomField c2 = new CustomField();
        c2.setTypeId("c2");
        c2.setValue("v2");
        CustomField c3 = new CustomField();
        c3.setTypeId("c3");
        c3.setValue("v3");
        templateObject.getCustomFields().add(c1);
        templateObject.getCustomFields().add(c2);
        templateObject.getCustomFields().add(c3);
        return templateObject;
    }

    @GET
    @Path("/testarray")
    public List<Group> testArray() {
        Group g = new Group("adf23-374jdsh-dkfj");
        List list = new ArrayList<Group>();
        list.add(g);
        list.add(g);
        list.add(g);
        return list;
    }
}