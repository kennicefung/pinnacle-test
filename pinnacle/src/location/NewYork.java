package location;

import product.category.Clothing;
import product.category.Food;
import product.category.ProductCategory;

public class NewYork implements Location{
	public double getTaxRate(){
		return 9.75;
	}
	public boolean isExempt(ProductCategory p){
		if(p instanceof Food || p instanceof Clothing)
			return true;
		return false;
	}
}