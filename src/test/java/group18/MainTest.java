package group18;

import static group18.parameters.CONNECTORS.*;
import static group18.parameters.CONNECTORS.NOTUSED;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import group18.parameters.CONNECTORS;
import org.junit.jupiter.api.Test;

public class MainTest
{
    /**
     * Test example largely inspired from assignment .pdf where
     * only the first four LICs are used and need to return true.
     * End result should be true (and print "YES") as all four
     * of the LICs should return true given the data.
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Values vals = new Values();
        double[] x = {1,0,0};
        double[] y = {0,0,1};
        int numPoints = 3;
        CONNECTORS[][] lcm = {{ANDD, ANDD, ORR, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ANDD, ANDD, ORR, ORR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ORR, ORR, ANDD, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ANDD, ORR, ANDD, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED }};
        boolean[] puv = {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false};
        vals.init(x,y,numPoints, lcm, puv);
        vals.PARAMETERS.init(0, 0, 0, 0, 0, 0,0,0,0,
                0, 3,0,0,0,0,0,0,0,0);
        Main.DECIDE(vals);
        assertTrue(vals.LAUNCH);
    }

    /**
     * Test example largely inspired from assignment .pdf where
     * only the first four LICs are used and need to return true.
     * End result should be true (and print "NO") as LIC0 will
     * return false with the given value for LENGTH1.
     */
    @Test
    public void shouldAnswerWithFalse()
    {
        Values vals = new Values();
        double[] x = {1,0,0};
        double[] y = {0,0,1};
        int numPoints = 3;
        CONNECTORS[][] lcm = {{ANDD, ANDD, ORR, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ANDD, ANDD, ORR, ORR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ORR, ORR, ANDD, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {ANDD, ORR, ANDD, ANDD, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED },
                {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED }};
        boolean[] puv = {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false};
        vals.init(x,y,numPoints, lcm, puv);
        vals.PARAMETERS.init(100000, 0, 0, 0, 0, 0,0,0,0,
                0, 3,0,0,0,0,0,0,0,0);
        Main.DECIDE(vals);
        assertFalse(vals.LAUNCH);
    }


    /**
     * Test case where every single LIC is required to be true
     * for the end result to be a "YES" for the launch. The
     * input data and parameters were hand-picked in a way so
     * that every LIC will return true. Thus, the end result
     * should be true (and print "YES").
     */
    @Test
    public void oneTestToRuleThemAll(){
        Values vals = new Values();
        double[] x = {1,0,0,-1,-32,0,0,3,0,5};
        double[] y = {0,0,1,-1,-33,1,0,3,0,1};
        int numPoints = x.length;
        CONNECTORS[][] lcm = {{ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD },
                {ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD, ANDD }};
        boolean[] puv = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        vals.init(x,y,numPoints, lcm, puv);
        vals.PARAMETERS.init(0, 100000, 0, 100000, 1, 100000,0,0,2,
                1, 3,1,1,1,1,1,1,1,1);
        Main.DECIDE(vals);
        assertTrue(vals.LAUNCH);
    }


}
