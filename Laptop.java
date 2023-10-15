package dhanu1;

public class Laptop {
	public static void main(String[] args) {
		Dayy1of7 l = new Dayy1of7();
		l.name = "Laptop";
		l.model = "i5";
		l.price = 45000;
		l.edition = 2020;
		l.tax_value = 15;
		l.discount = 20;
		l.discount_amount = l.price * l.discount / 100;
		l.tax_amount = l.price * l.tax_value / 100;
		l.net_price = l.price + l.tax_amount;
		l.net_price = l.price - l.discount_amount;

		System.out.println();

	}

}
