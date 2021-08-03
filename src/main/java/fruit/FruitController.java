package fruit;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitController {

    @Inject
    FruitService fruitService;

    @GET
    public Iterable<Fruit> findAll() {
        return fruitService.findAll();
    }

    @POST
    public Fruit save(Fruit fruit) {
        return fruitService.save(fruit);
    }

    @PUT
    public Fruit update(Fruit fruit) {
        return fruitService.update(fruit);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        fruitService.deleteById(id);
    }
}
