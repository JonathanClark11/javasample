
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		File file = new File("newFile.txt");
		assertTrue(file.exists());
	}

}