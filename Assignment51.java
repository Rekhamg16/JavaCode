package package2;
import java.util.Scanner;
public class Assignment51 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Type the word");
		String a = s1.next();
		for(int i=0;i<=a.length()-1;i++) 
		{ char b = a.charAt(i);
			System.out.println(b);
		}
		s1.close();
	}

}
