/**
 * ****************************************************************************
 * SolutionJUnitTest.java
 * Kevin Bell
 *
 * This program unit tests area or perimeter values.
 * ***************************************************************************
 */
package codeWars;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;
import org.junit.Test;

@RunWith(Parameterized.class)
public class SolutionJUnitTest {

    public SolutionJUnitTest() {
    }
    //length
    @Parameterized.Parameter(0)
    public int l;
    //width
    @Parameterized.Parameter(1)
    public int w;
    //expected result
    @Parameterized.Parameter(2)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {16, 4, 40},
            {32, 6, 76},
            {64, 8, 144},
            {64, 12, 152},
            {128, 24, 304}
        };
        return Arrays.asList(data);
    } // end method

    @Test
    public void testEverything() {
        double actual = Solution.areaOrPerimeter(l, w);
        assertEquals(result, actual, 0.01);
    } // end testEverything method

    @Test
    public void testSomething() {
        assertEquals(16, Solution.areaOrPerimeter(4, 4));
        assertEquals(32, Solution.areaOrPerimeter(6, 10));
        assertEquals(64, Solution.areaOrPerimeter(8, 8));
        assertEquals(64, Solution.areaOrPerimeter(12, 20));
        assertEquals(128, Solution.areaOrPerimeter(24, 40));
        assertNotEquals(127, Solution.areaOrPerimeter(24, 40));
    } // end testSomething method 
} // end SolutionJUnitTest class
