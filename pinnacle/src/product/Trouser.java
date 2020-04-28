package product;

import product.category.ProductCategory;
import product.category.Clothing;

public class Trouser implements Product{

	private ProductCategory category;
	private String name;
	public Trouser() {
		this.name = "trouser";
		this.category = new Clothing();
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}

	public double getUnitPrice() {
		return 199.9;
	}
	
	public String toString() {
		return this.name;
	}
}
