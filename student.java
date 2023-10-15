package dhanu1;

public class student {
public static void main (String[]args) {
	Dayy1of5 s = new Dayy1of5();
	         s.Name = "Vijay";
	         s.roll_no = "U20AF24";
	         s.phone_no = 89250992065l;
	         s.height = 160.2f;
			 s.initial = 'c';
	         s.ismale = true;
	         s.tamil_mark = 88;
	         s.english_mark = 98;
	         s.maths_mark = 100;
	         s.science_mark = 92;
	         s.social_mark = 90;
	         s.student_total = s.tamil_mark+s.english_mark+s.maths_mark+s.science_mark+s.social_mark;
	         s.average = s.student_total /5 ;
	         
System.out.println(s.Name+"\n"+s.roll_no+"\n"+s.phone_no+"\n"+s.height+"\n"+s.initial+"\n"+s.ismale+"\n"+s.tamil_mark+"\n"+s.english_mark+"\n"+s.maths_mark+"\n"+s.science_mark+"\n"+s.social_mark+"\n"+s.student_total+"\n"+s.average);
	         
	         
	         
	         
}

}
