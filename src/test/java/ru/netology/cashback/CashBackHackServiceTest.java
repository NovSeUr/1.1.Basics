package ru.netology.cashback;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void testShouldUseRemainCriticalPath() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void testBoundaryValueOne() {
        assertThrows(RuntimeException.class, () ->{
            service.remain(-1);
        });
    }
    @Test
    public void testBoundaryValueTwo() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testBoundaryValueThree() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void testBoundaryValueFour () {
        assertEquals(service.remain(2), 998);
    }

    @Test
    public void testBoundaryValueFive () {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testBoundaryValueSix () {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testBoundaryValueSeven () {
        assertEquals(service.remain(999), 1);
    }


}