
import codeWars.Solution;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionJUnitTest {

    public SolutionJUnitTest() {
    }

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
