package package2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Examinputmismath {
	public static void main(String[] args) {
		try {
	    Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter Arrays size:-");
		String[] name = new String[s1.nextInt()];
		for (int i=0;i<=name.length;i++) {
			name [i]=s1.next();
			System.out.println("Please enter value of index:--"+i);
		}
		System.out.println(Arrays.toString(name));
		s1.close();
		}
	catch( InputMismatchException e) {
	
      System.out.println("Exception handle");
	}
}
	}