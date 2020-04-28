package product;

import product.category.ProductCategory;
import product.category.Food;

public class PotatoChips implements Product{

	private ProductCategory category;
	private String name;
	public PotatoChips() {
		this.name = "potato chips";
		this.category = new Food();
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}

	public double getUnitPrice() {
		return 3.99;
	}
	
	public String toString() {
		return this.name;
	}
}
