package package2;

import java.util.Scanner;

public class Assignment53 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("This is your input=>");
		String input = s1.next();
		String reverse = "";
		for(int i=input.length()-1;i>=0;i--)
		{char c1 = input.charAt(i);
		reverse = reverse+c1;
			}
	 System.out.println("This is your output=>"+reverse);
     if(input.equals(reverse))
     { 
             System.out.println("It is a Palindrome");
     }
     else
     {
             System.out.println("It is Not a Palindrome");
     }
s1.close();
	}
}