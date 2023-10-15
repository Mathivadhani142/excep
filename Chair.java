package dhanu1;

public class Chair {
public static void main (String[]args) {
    Dayy1of4 c = new Dayy1of4();
    c.brand = "abacus";
    c.colour = "white";
    c.name = "Chair";
    c.number_of_legs = 4;
    c.iswood = true;
    
//    System.out.print(c.brand + " " + c.colour + " " + c.name + " " + c.number_of_legs + " " + c.iswood);
String a = "AFSRa,fhail";

for(int i =0;i<a.length();i++) {
	if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
		System.out.println(a.charAt(i));
	}
}



}

}

