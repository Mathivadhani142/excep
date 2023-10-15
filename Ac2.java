package dhanu1;

public class Ac2 {
public static void main(String[]args){
	Dayy1of6 a1 = new Dayy1of6();
	         a1.discount = 5;
	         a1.price = 50000;
	         a1.discount_amt = a1.price * a1.discount / 100;
	         a1.net_price = a1.price - a1.discount_amt;
	         
System.out.println(a1.discount+" "+a1.price+" "+a1.discount_amt+" "+a1.net_price);

}

}
