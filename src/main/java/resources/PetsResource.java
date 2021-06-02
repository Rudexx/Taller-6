package resources;

import resources.pojos.Book;
import resources.pojos.OwnerPOJO;
import resources.pojos.PetPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/owners/{person_Id}/pets")
public class PetsResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("person_Id") Integer personid) {

        List<PetPOJO> pets = new ArrayList<PetPOJO>();
        pets.add(new PetPOJO(1, "MAAAA5421" , "James" , "Feline" , "Abisinio" , "Big" ,
                "Male" , "James.jpg" , personid));

        pets.add(new PetPOJO(2, "MAAAA5422" , "Olivia" , "Canine" , "Husky" , "Medium" ,
                "Female" , "husky.jpg" , personid));

        return Response.ok()
                .entity(pets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("person_Id") Integer personId, PetPOJO p) {

        p.setPet_id(3);

        return Response.status(Response.Status.CREATED)
                .entity(p)
                .build();
    }









}
