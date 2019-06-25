package examples;

public class Example30 {

	double price;

	public static class Test {

		public void updatePrice(Example30 product, double price) {
			price = price * 2;
			product.price = product.price + price;

		}

		public static void main (String[] args) {
			Example30 prt = new Example30();
			prt.price = 200;
			double newPrice = 100;
			
			Test t= new Test();
			t.updatePrice(prt, newPrice);
			System.out.println(prt.price+":"+newPrice);
			

		}

	}

}
