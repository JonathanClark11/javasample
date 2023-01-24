
import static org.junit.Assert.*;
import org.junit.Test;

public class HelperMethodsTest {
    @Test
    public void testPreMr() {
        assertEquals("Mr. John", HelperMethods.preMr("John"));
    }
    @Test
    public void testPreMs() {
        assertEquals("Ms. Jane", HelperMethods.preMs("Jane"));
    }
    @Test
    public void testPreDr() {
        assertEquals("Dr. Smith", HelperMethods.preDr("Smith"));
    }
}