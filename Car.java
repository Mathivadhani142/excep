package dhanu1;

public class Car {
	public static void main(String[] args) {
		dayy1of3 c = new dayy1of3();
		c.brand = "Lamborghini";
		c.colour = "Black";
		c.name = "Car";
		c.price = 250;
		c.year = 2000;
		//c.taxAmount = 3000;
		System.out.println(c.findNetPrice(c.price,5));
		
		
	}
}
