
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMain() {
        // create a file object for the current location
        File file = new File("newFile.txt");
        boolean value = file.createNewFile();
        assertTrue(value);
    }

}