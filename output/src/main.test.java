
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFile() {
        File file = new File("newFile.txt");
        assertFalse(file.exists());
        try {
            file.createNewFile();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        assertTrue(file.exists());
    }
}