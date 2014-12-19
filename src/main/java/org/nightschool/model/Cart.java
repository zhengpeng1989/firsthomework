package org.nightschool.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/6 0006.
 */
public class Cart {

    private final List<Disk> disks = new ArrayList<Disk>();

    public List<Disk> getDisks() {
        return disks;
    }

    public void addDisk(Disk disk) {
        disks.add(disk);

    }
}
