
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
    } // end testSomething method
} // end SolutionJUnitTest class
