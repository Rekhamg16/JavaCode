package package2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment59 {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter size of array");
		int a=s1.nextInt();
		String [] name = new String[a];
		int [] srn = new int[a];
		for(int i=0;i<a;i++) 
		{ 
			System.out.println("Enter "+(i+1)+ " subject");
			name [i]= s1.next();
			System.out.println("Enter "+(i+1)+ " marks");
			srn [i]= s1.nextInt();	
		}
		System.out.println("OUTPUT:=>");
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(srn));
	s1.close();
	}
}

