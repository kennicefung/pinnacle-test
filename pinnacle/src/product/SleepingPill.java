package product;

import product.category.ProductCategory;
import product.category.Drug;

public class SleepingPill implements Product{

	private ProductCategory category;
	private String name;
	public SleepingPill() {
		this.name = "sleeping pills";
		this.category = new Drug();
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}

	public double getUnitPrice() {
		return 59.9;
	}
	
	public String toString() {
		return this.name;
	}
}
