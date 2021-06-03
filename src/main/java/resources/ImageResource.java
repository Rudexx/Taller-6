package resources;

import resources.pojos.ImagePOJO;
import resources.pojos.PetPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{person_Id}/pets/{pet_id}/image")
public class ImageResource {




    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("person_Id") Integer personId, @PathParam("pet_id") Integer pet_id , ImagePOJO image) {



        return Response.status(Response.Status.CREATED)
                .entity(image)
                .build();
    }









}
