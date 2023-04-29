package ru.netology.cashback;

public class CashBackHackServiceTestJUnit5 {
    CashBackHackService service = new CashBackHackService();
    @org.junit.jupiter.api.Test
    public void testShouldUseRemainCriticalPathJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(600, service.remain(400));
    }

    @org.junit.jupiter.api.Test
    public void testBoundaryValueOneJupiter() {
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }
    @org.junit.jupiter.api.Test
    public void testBoundaryValueTwoJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void testBoundaryValueThreeJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void testBoundaryValueFourJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void testBoundaryValueFiveJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void testBoundaryValueSixJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1001));
    }
}

