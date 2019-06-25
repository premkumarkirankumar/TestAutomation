package keywords;

public class KClass20 {

	int number = 5;
	String text = "Allegis";

	public void method1() {

		int number = 6;
		String text = "Tek";

		System.out.println("number: " + number);

		System.out.println("text: " + text);
	}

	// using this keyword

	public void method2() {

		int number = 7;
		String text = "MSU";

		System.out.println("number : " + this.number);

		System.out.println("text: " + this.text);
	}

	public static void main(String[] args) {

		KClass20 ob = new KClass20();
		ob.method1();

		ob.method2();
	}

}
