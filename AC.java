package dhanu1;

public class AC {
public static void main(String[]args){
	
	
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	System.out.println("helloWorld");
	
	Dayy1of6 a = new Dayy1of6();
	         a.brand = "Hitachi";
	         a.price = 50000;
	         a.tax_percentage = 5;
	         a.tax_amount = a.price * a.tax_percentage/100;
	         a.net_price = a.price + a.tax_amount;
	         
System.out.println(a.brand+" "+a.price+" "+a.tax_percentage+" "+a.tax_amount+" "+a.net_price);

	
			
}

}
