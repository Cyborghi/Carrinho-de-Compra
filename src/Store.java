import java.util.*;


public class Store {
	protected List<Product> products;

	public Store() {
		this.products = new ArrayList<Product>();
	}
	
	public void addProduct (Product product) {
		this.products.add(product);
	}
	
	public boolean productRemoval(String nomeProduto) {
		for(Product p : this.products) {
			if (p.getName().equals(nomeProduto)) {
				this.products.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public void showProduct(String nome) {
		if (this.getQuantity() > 0) {
			for (Product p : this.products) {
				if (p.getName().equals(nome)) {
					System.out.println(p);
				}
			}
		} else {
			System.out.println("Seu carrinho ainda não possui produtos.\n");
		}
	}
	
	public int getQuantity() {
		return this.products.size();
	}
	
	public boolean productSearch (String nomeProduto) {
		for(Product p : this.products) {
			if (p.getName().equals(nomeProduto)) {
				return true;
			}
		}
		return false;
	}	
	
	public void showAll () {
		for (Product p : this.products) {			
			System.out.println(p);
		}
		System.out.println();
	}
	
}
