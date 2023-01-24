
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testFileCreation() {
        File file = new File("newFile.txt");
        assertTrue(file.createNewFile());
    }
}