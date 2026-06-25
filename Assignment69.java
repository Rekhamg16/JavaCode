package package2;
import java.util.Date;
public class Assignment69 {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String dateformat1 = d2.toString();
		String date =dateformat1.substring(8, 10);
		String month=dateformat1.substring(4, 7);
		String year =dateformat1.substring(dateformat1.length()-4);
		String hour =dateformat1.substring(11, 13);
		String min =dateformat1.substring(14, 16);
		String sec =dateformat1.substring(17, 19);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println(hour); 
		System.out.println(min);
		System.out.println(sec);
        String format1=        date.concat(month).concat(year);
        String format2=        date.concat("/").concat(month).concat("/").concat(year);
        System.out.println(format1);
	    System.out.println(format2);
		
	}

}
