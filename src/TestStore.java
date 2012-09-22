import static org.junit.Assert.*;

import org.junit.Test;


public class TestStore {

	Store store;
	
	public TestStore() {
		this.store = new Store();
	}
	
	@Test
	public void testQuantidade() {
		Product p = new Product("Playstation3", 100, (float) 2999);
		store.addProduct(p);
		Product p2 = new Product("NintendoWii", 100, (float) 21599);
		store.addProduct(p2);
		Product p3 = new Product("XBOX360", 200, (float) 2999);
		store.addProduct(p3);
		Product p4 = new Product("NintendoDS", 300, (float) 5699);
		store.addProduct(p4);
		
		assertTrue(store.getQuantity() == 4);
	}
	
	@Test
	public void addTest() {
		Product p = new Product("Playstation3", 100, (float) 2999);
		store.addProduct(p);
		
		assertTrue(store.getQuantity() == 1);
	}
	
	@Test
	public void removalTest() {
		Product p = new Product("XBOX360", 100, (float) 2999);
		store.addProduct(p);
		store.productRemoval("XBOX360");
		assertTrue(store.getQuantity() == 0);
	}
	
	@Test
	public void searchTest() {
		Product p = new Product("XBOX360", 100, (float) 2999);
		store.addProduct(p);
		assertTrue(store.productSearch("XBOX360"));
	}

}
