package location;

import product.category.ProductCategory;

public interface Location{
	public double getTaxRate();
	public boolean isExempt(ProductCategory p);
}