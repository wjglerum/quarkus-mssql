package nl.wjglerum;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{id}")
    public String greeting(@PathParam("id") Long id) {
        try {
            return Greeting.findById(id).message;
        } catch (NullPointerException e) {
            throw new NotFoundException("Greeting not found");
        }
    }
}
