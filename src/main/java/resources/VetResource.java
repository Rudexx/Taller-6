package resources;


import resources.pojos.OwnerPOJO;
import resources.pojos.VetPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets/{username}")
public class VetResource {

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, VetPOJO vet) {

        return Response.ok()
                .entity(vet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("username") String username) {

        return Response.noContent()
                .build();
    }

}