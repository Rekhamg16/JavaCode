package package1;
import java.util.Scanner;
public class Assignment29 {

	public static void main(String[] args) {
		Scanner p= new Scanner (System.in);
		System.out.print("Enter value of n => ");
		int n =p.nextInt();
		System.out.print("\nEnter your require output's number: 1 - Printing upto Number; 2 - Even Number; 3 - Odd Number; 4 - Sum upto Number; 5 - Table of Number => ");
		int c =p.nextInt();
		switch (c){
		case 1: {System.out.println("The number from 1 to " +n+ " is=> ");
		for (int i=1; i<=n;i++) 
		{
		System.out.print(i+ " ");
		}} break;	
		case 2: {System.out.println("\nThe even number from 1 to " +n+ " is=> ");
	    for (int i=2; i<=n;i++) 
		{
		 if(i%2==0)
			{	System.out.print(i+ " ");	}	
		}} break;	
		case 3: {System.out.println("\nThe odd number from 1 to " +n+ " is=> ");
		for (int i=2; i<=n;i++) 
			{
		 if(i%2!=0)
				{	System.out.print(i+ " ");	}	
		}} break;
		case 4: {System.out.println("\nThe sum of number from 1 to " +n+ " is=> ");
		int sum = 0;
		for (int i=1; i<=n;i++) 
		{sum = sum+i;}
			System.out.print(sum);} break;
		case 5: {System.out.println("\nThe multiplication table of  " +n+ " is=> ");
			for (int i=1; i<=10;i++) 
			{ System.out.println(n*i);}} break;
		}p.close();
}
}