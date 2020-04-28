package product;

import product.category.ProductCategory;
import product.category.Food;

public class Beef implements Product{
	private String name;
	private ProductCategory category;
	public Beef() {
		this.name = "beef";
		this.category = new Food();
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}

	public double getUnitPrice() {
		return 99.9;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
