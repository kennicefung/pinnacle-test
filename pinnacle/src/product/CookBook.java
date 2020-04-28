package product;

import product.category.ProductCategory;
import product.category.Book;

public class CookBook implements Product{

	private ProductCategory category;
	private String name;
	public CookBook() {
		this.name = "cookbook";
		this.category = new Book();
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}

	public double getUnitPrice() {
		return 17.99;
	}
	
	public String toString() {
		return this.name;
	}
}
