package org.nightschool.model;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Administrator on 2014/12/6 0006.
 */
public class CartTest {

    private Cart cart = new Cart();

    @Test
    public void should_be_able_to_search() throws Exception {
    }

    @Test
    public void should_be_able_to_add() throws Exception {
        Disk disk = new Disk();

        cart.addDisk(disk);
        List<Disk> disks = cart.getDisks();

        assertThat(disks.size(),is(1));
}

    @Test
    public void should_cart_be_empty_when_no_disk_added() throws Exception {
        List<Disk> disks = cart.getDisks();

        assertThat(disks.size(),is(0));
    }
}
