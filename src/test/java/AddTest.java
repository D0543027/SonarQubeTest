import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Add a = new Add();
		
		assertEquals(5, a.add(2, 3));
	}

}
