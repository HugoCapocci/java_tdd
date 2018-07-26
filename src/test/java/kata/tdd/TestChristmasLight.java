package kata.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import kata.tdd.ChristmasLight;

public class TestChristmasLight {
    ChristmasLight christmasLight;

    @Before
    public void setUp() {
        christmasLight = new ChristmasLight();
    }

    @Test
    public void testDummy() {
        assertTrue("Should be true ", christmasLight.getValue());
    }
}