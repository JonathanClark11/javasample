
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelperMethodsTest {
    @Test
    public void testPreMr() {
        assertEquals("Mr. Smith", HelperMethods.preMr("Smith"));
    }
    
    @Test
    public void testPreMs() {
        assertEquals("Ms. Smith", HelperMethods.preMs("Smith"));
    }
    
    @Test
    public void testPreDr() {
        assertEquals("Dr. Smith", HelperMethods.preDr("Smith"));
    }
}