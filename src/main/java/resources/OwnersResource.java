package resources;

import resources.pojos.Author;
import resources.pojos.OwnerPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/owners")
public class OwnersResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list( @QueryParam("neighbourhood")) {

        List<OwnerPOJO> owners = new ArrayList<OwnerPOJO>();
        owners.add(new OwnerPOJO(1, "David Jose Nogales León",
                "Diagonal 200 3950" , "Bogotá"));
        owners.add(new OwnerPOJO(2, "Daniel Rodriguez",
                "calle 200 2000" , "Cundinamarca"));

        return Response.ok()
                .entity(owners)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(OwnerPOJO o) {
        List<OwnerPOJO> owners = new ArrayList<OwnerPOJO>();
        o.setPerson_id(3);
        owners.add(o);

        return Response.status(Response.Status.CREATED)
                .entity(o)
                .build();
    }




}
