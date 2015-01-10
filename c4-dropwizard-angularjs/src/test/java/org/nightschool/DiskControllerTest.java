package org.nightschool;

import org.junit.Test;
import org.nightschool.model.Disk;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiskControllerTest {
    public  final DiskController diskController=new DiskController();
    @Test
    public void test_list_disks_is_empty() {
        List<Disk> disks = diskController.list();
        assertThat(disks.size(),is(0));
    }
    @Test
    public void test_list_disks_is_non_empty_after_add_a_disk(){
        Disk disk = new Disk("name","img","desc",1,30.0);
        diskController.add(disk);
        assertThat(diskController.list().size(),is(1));

    }



}