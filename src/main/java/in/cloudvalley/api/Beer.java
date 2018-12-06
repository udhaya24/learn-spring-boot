package in.cloudvalley.api;

import java.lang.Object;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Request;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/beer")
public interface Beer {
  @GET
  List<in.cloudvalley.api.beans.Beer> getAllBeers();

  @POST
  void createNewBeer(in.cloudvalley.api.beans.Beer body);

  @Path("/{name}")
  @GET
  in.cloudvalley.api.beans.Beer getByName(@PathParam("name") Object name, Request body);

  @Path("/{name}")
  @PUT
  void updateBeer(@PathParam("name") Object name, in.cloudvalley.api.beans.Beer body);

  @Path("/{name}")
  @DELETE
  void deleteByName(@PathParam("name") Object name, Request body);

  @Path("/findByStatus/{status}")
  @GET
  in.cloudvalley.api.beans.Beer getBeerByStatus(@PathParam("status") Object status);
}
