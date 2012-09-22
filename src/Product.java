
public class Product {
	
	protected String name;
	
	protected int quant;
	
	protected int id;
	
	protected float price;
	
	public static int ID = 1;

	public Product(String nome, int quantidade, float preco) {
		super();
		this.name = nome;
		this.quant = quantidade;
		this.price = preco;
		this.id = Product.ID++;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String nome) {
		this.name = nome;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float preco) {
		this.price = preco;
	}
	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quantidade) {
		this.quant = quantidade;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + name + ", quantidade=" + quant + ", id="
				+ id + ", preco=" + price + "]";
	}
	
	
}
