package org.nightschool;

import org.nightschool.model.Disk;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2014/12/20.
 */
@Path("/disks")
public class DiskController {


    private final ArrayList<Disk> disks = new ArrayList<>();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disk> list() {
        return disks;
    }
    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Disk add(Disk disk) {
        disks.add(disk);
        return  disk;
    }
    @POST
    @Path("remove")

    @Produces(MediaType.APPLICATION_JSON)
    public Disk remove(Disk disk){

        disks.remove(disk);
        return  disk;
    }
}
