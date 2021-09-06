package org.akash;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.akash.soapclient.HelloWorldServiceClient;

@Path("/test")
public class Test {

    @Inject
    FileUploader fileUploader;

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person test() {
        Person p = new Person();
        p.setAddress("Shankhamul");
        p.setName("Akash");
        p.setId(12L);
        return p;
    }
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	@Path("/soap")
    public String testSoap() {
        return HelloWorldServiceClient.get().getHelloWorldAsString("Akash Shrestha from Quarkus");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/uploadminio")
    public String uploadFile(){
	    try {
            fileUploader.uploadFile();
        }catch(Exception e){
	        e.printStackTrace();
        }
	    return "Uploaded!";
    }
}
