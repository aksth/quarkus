package org.akash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/another")
public class AnotherResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String another() {
        return "another resource";
    }
}