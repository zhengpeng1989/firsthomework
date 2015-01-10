package org.nightschool;
import org.nightschool.model.Cart;
import org.nightschool.model.Disk;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("/cart")
public class CartController {
    private Cart cart = new Cart();

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
   public List<Disk> getDiskInfo(){
        return  cart.getDisks();
    }
    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Disk disk) {
        cart.addDisk(disk);
    }
}
