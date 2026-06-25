package package2;

import java.util.Arrays;
import java.util.Date;

public class Assignment70 {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime()+1000*60*60*24*17l);
		System.out.println(d2);
		Date d3 = new Date(d1.getTime()-1000*60*60*24*5l);
		System.out.println(d3);
		String c1 = d2.toString();
		System.out.println("string: "+c1);
		String [] c2=c1.split("[ :]+");
		System.out.println(Arrays.toString(c2));
		String c3 = d3.toString();
		System.out.println("string "+c3);
		String [] c4=c3.split("[ :]+");
		System.out.println(Arrays.toString(c4));
		System.out.println("The date after 17 days from today: "+c2[2].concat("/").concat(c2[1]).concat("/").concat(c2[7]));
		System.out.println("The date before 5 days from today: "+c4[2].concat("/").concat(c4[1]).concat("/").concat(c4[7]));
		
	}

}


