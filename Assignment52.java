package package2;

import java.util.Scanner;

public class Assignment52 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Type the input word: ");
		String a = s1.next();
		System.out.println("Reverse of input word " +a+" is: "); 
		for(int i=a.length()-1;i>=0;i--) 
		{ char c = a.charAt(i);
			System.out.print(c);
		}
		s1.close();
	}
}