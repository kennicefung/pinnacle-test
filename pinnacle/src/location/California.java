package location;

import product.category.Food;
import product.category.ProductCategory;

public class California implements Location{
	public double getTaxRate(){
		return 8.875;
	}
	public boolean isExempt(ProductCategory p){
		if(p instanceof Food)
			return true;
		return false;
	}
}