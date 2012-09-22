import static org.junit.Assert.*;

import org.junit.Test;


public class ProductTest {

	@Test
	public void nameTest() {
		Product p = new Product("XBOX360", 100, (float) 2999.00);
		assertTrue(p.getName().equals("XBOX360"));		
	}

}
