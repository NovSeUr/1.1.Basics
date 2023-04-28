package ru.netology.cashback;

import org.junit.Test;

import org.junit.Assert;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void testShouldUseRemainCriticalPath() {
       Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void testBoundaryValueOne() {
        Assert.assertThrows(RuntimeException.class, () ->{
            service.remain(-1);
        });
    }
    @Test
    public void testBoundaryValueTwo() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testBoundaryValueThree() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void testBoundaryValueFour () {
        Assert.assertEquals(service.remain(2), 998);
    }

    @Test
    public void testBoundaryValueFive () {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testBoundaryValueSix () {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testBoundaryValueSeven () {
        Assert.assertEquals(service.remain(999), 1);
    }


}