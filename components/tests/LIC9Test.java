
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LIC9Test {
    /**
     * Testing with incorrect input, the angle formed is 1.24 rad 
     * which is not less than pi-2.
     */
    @Test
    void falseTest() {
        double[] xs = {4,0,0,0,1,0,0,1};
        double[] ys = {2,0,0,0,1,0,0,3};
        LIC9 lic9 = new LIC9();
        assertFalse(lic9.getLic9(xs,ys,xs.length,3,2,3.1415926535, 2));
    }

    /**
     * Testing with correct input, the angle formed is 0.78 rad
     * which i less than pi-2.
     */
    @Test
    void trueTest() {
        double[] xs = {2,0,0,1,0,1};
        double[] ys = {2,0,0,1,0,3};
        LIC9 lic9 = new LIC9();
        assertTrue(lic9.getLic9(xs,ys,xs.length,2,1,3.1415926535, 2));
    }
}