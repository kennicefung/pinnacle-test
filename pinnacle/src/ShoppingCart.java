import java.util.HashMap;
import java.util.Map;

import location.*;
import product.*;

public class ShoppingCart {
	private HashMap<String, ShoppingCartItem> items;
	private Location location; 
	
	public ShoppingCart(String location) {
		items = new HashMap<String, ShoppingCartItem>();
		switch (location.toUpperCase()) {
			case "NY": this.location = new NewYork(); break;
			case "CA": this.location = new California(); break;
		}
	}
	
	public void addToCart(String s) {
		Product p;
		s = s.toLowerCase();
		switch (s) {
			case "beef": p = new Beef(); addToCart(s, p); break;
			case "cookbook": p = new CookBook(); addToCart(s, p); break;
			case "potatochips": p = new PotatoChips(); addToCart(s, p); break;
			case "sleepingpill": p = new SleepingPill(); addToCart(s, p); break;
			case "trouser": p = new Trouser(); addToCart(s, p); break;
		}
	}
	
	public void addToCart(String s, Product p) {
		if(items.containsKey(s))
			items.get(s).addItem();
		else
			items.put(s, new ShoppingCartItem(p, 1));
	}
	
	public void printInvoice() {
		System.out.println();
		System.out.println(String.format("%-20s%-16s%-16s", "item", "price", "qty"));
		double subtotal = 0;
		double tax = 0;
		for(Map.Entry<String, ShoppingCartItem> entry : items.entrySet()){
			ShoppingCartItem i = entry.getValue();
			System.out.println(i);
			subtotal += i.getPrice();
			tax += i.getTax(this.location);
		}
		System.out.println(String.format("%-36s$%.2f","subtotal:", subtotal));
		System.out.println(String.format("%-36s$%.2f","tax:", tax));
		System.out.println(String.format("%-36s$%.2f", "total:", (subtotal + tax)));

		System.out.println();
	}
	
	public class ShoppingCartItem{
		private Product p;
		private int qty;
		
		public ShoppingCartItem(Product p, int qty) {
			this.p = p;
			this.qty = qty;
		}
		public Product getProduct() {
			return p;
		}
		public int getQty() {
			return qty;
		}
		public void addItem() {
			this.qty += 1;
		}
		public double getPrice() {
			return this.p.getUnitPrice() * this.qty;
		}
		public double getTax(Location location) {
			if(location.isExempt(this.p.getCategory())) {
				return 0;
			}
			else {
				double tax = getPrice() * location.getTaxRate() / 100; 
				tax = Math.round(tax * (1/0.05)) / (1/0.05);
				return tax;
			}
		}
		
		@Override
		public String toString() {
			return String.format("%-20s$%-16.2f%-16d", this.p, this.p.getUnitPrice(), this.qty);
		}
	}
}


