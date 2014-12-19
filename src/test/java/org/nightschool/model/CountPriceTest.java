package org.nightschool.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CountPriceTest {
    Disk disk = new Disk();
    CountPrice cp = new CountPrice();
    @Test
    public void testCount() throws Exception {

    }

    @Test
    public void testCountBigDisk() throws Exception {

        disk.setName("1TB大容量光盘");
        disk.setPrice(1.0);

        assertThat(cp.countBigDisk(disk, 4), is(3.8));
    }

    @Test
    public void testCountIndieDisk() throws Exception {
     disk.setName("小清新光盘");
        disk.setPrice(20.0);
        assertThat(cp.countIndieDisk(disk,9),is(180.0));
    }
    @Test
    public  void testCountWeddingDisk() throws Exception{
        disk.setName("婚庆光盘");
        disk.setPrice(26.0);
        assertThat(cp.countWeddingDisk(disk,8), is(188.0));
    }
}