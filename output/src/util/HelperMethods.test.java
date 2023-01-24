
import org.junit.Test;
import static org.junit.Assert.*;

public class HelperMethodsTest {
    @Test
    public void testPreMr() {
        assertEquals("Mr. John Smith", HelperMethods.preMr("John Smith"));
    }
    @Test
    public void testPreMs() {
        assertEquals("Ms. Jane Doe", HelperMethods.preMs("Jane Doe"));
    }
    @Test
    public void testPreDr() {
        assertEquals("Dr. John Smith", HelperMethods.preDr("John Smith"));
    }
}