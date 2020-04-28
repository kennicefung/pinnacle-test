package product;

import product.category.ProductCategory;

public interface Product {
	public ProductCategory getCategory();
	public double getUnitPrice();
}
