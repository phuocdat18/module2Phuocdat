package CleanCode.SplitMethod;

import org.junit.Test;
import static org.junit.Assert.*;

public class CylinderTest {

    @Test
    public void testGetVolume() {
        double expected = 628.318;
        double actual = Cylinder.getVolume(5, 10);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetPerimeter() {
        double expected = 31.416;
        double actual = Cylinder.getPerimeter(5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetBaseArea() {
        double expected = 78.54;
        double actual = Cylinder.getBaseArea(5);
        assertEquals(expected, actual, 0.001);
    }
}