import java.util.Scanner;

public class Test{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter location (CA/NY): ");
		String location = s.next();

		if(!location.equals("CA") && !location.equals("NY")) {
			System.out.println("wrong input!");
			return;
		}
		
		ShoppingCart cart = new ShoppingCart(location);
		
		while(true) {
			System.out.println("add product to shopping cart (exit please input 'Q'): ");
			System.out.println("[beef/cookbook/potatochips/sleepingpill/trouser]");
			String p = s.next();
			if(p.toLowerCase().equals("q")) break;
			
			cart.addToCart(p);
			cart.printInvoice();
		}
		
	}
}