package ru.netology.cashback;

import org.junit.Assert;

public class CashBackHackServiceTestJUnit4 {
    CashBackHackService service = new CashBackHackService();

    @org.junit.Test
    public void testShouldUseRemainCriticalPath() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @org.junit.Test
    public void testBoundaryValueOne() {
        Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.Test
    public void testBoundaryValueTwo() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testBoundaryValueThree() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void testBoundaryValueFour() {
        Assert.assertEquals(service.remain(2), 998);
    }

    @org.junit.Test
    public void testBoundaryValueFive() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testBoundaryValueSix() {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test
    public void testBoundaryValueSeven() {
        Assert.assertEquals(service.remain(999), 1);
    }

}