package resources;


import resources.pojos.OwnerPOJO;
import resources.pojos.PetPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("owners")
public class CountByNeighbourhoodResource {



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response count() {

        List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

        OwnerPOJO owner1 = new OwnerPOJO(1, "David",
                "Diagonal 200 3950", "Bogotá", new ArrayList<String>());

        OwnerPOJO owner2 = new OwnerPOJO(2, "Jose",
                "Diagonal 223 3950", "Bogotá", new ArrayList<String>());

        OwnerPOJO owner3 = new OwnerPOJO(3, "Daniel",
                "Diagonal 217 3950", "Bogotá", new ArrayList<String>());

        OwnerPOJO owner4 = new OwnerPOJO(4, "Pedro",
                "Diagonal 236 3950", "Cali", new ArrayList<String>());

        OwnerPOJO owner5 = new OwnerPOJO(5, "Daniela",
                "Diagonal 214 3950", "Cali", new ArrayList<String>());

        OwnerPOJO owner6 = new OwnerPOJO(6, "Amy",
                "Diagonal 211 3950", "Cali", new ArrayList<String>());

        OwnerPOJO owner7 = new OwnerPOJO(7, "Roxanna",
                "Diagonal 500 3950", "Tunja", new ArrayList<String>());

        OwnerPOJO owner8 = new OwnerPOJO(8, "Carol",
                "Diagonal 300 3950", "Tunja", new ArrayList<String>());

        OwnerPOJO owner9 = new OwnerPOJO(9, "Liliana",
                "Diagonal 227 3950", "Tunja", new ArrayList<String>());

        list.add(owner1);
        list.add(owner2);
        list.add(owner3);
        list.add(owner4);
        list.add(owner5);
        list.add(owner6);
        list.add(owner7);
        list.add(owner8);
        list.add(owner9);

        List<String> neighbourhoods = new ArrayList<String>();
        int number = 0;

        for (int i = 0; i <list.size() ; i++) {
            String n = list.get(i).getNeighborhood();
            if(i != 0 && list.get(i).getNeighborhood() == list.get(i-1).getNeighborhood()) {

            }else{
                number++;
            }
        }



        return Response.status(Response.Status.NOT_FOUND).
                entity("holaaaaaaaaaa")
                .build();
    }
}

