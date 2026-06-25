package package1;
import  java. util.Scanner;
public class Practise1 {
	public static void main(String[] args) {
		Scanner s1= new Scanner(System .in);
	System.out.println("print marks of a:-");
		int a=s1.nextInt();
	System.out.println("print marks of b:-");
		int b=s1.nextInt();
	System.out.println("print marks of c:-");
		int c=s1.nextInt();
	System.out.println("print marks of d:-");
		int d=s1.nextInt();
	System.out.println("print marks of e:-");
		int e=s1.nextInt();
	    int sum =a+b+c+d+e;
        double avg =sum/5;
        System.out.println("Avgerage marks " +avg); 
     if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35) 
    {if(avg>=35) 
   	if (avg>=75)
 	    System.out.println("Pass with Distingstion");
 	    else if (avg>=60)
 	    System.out.println("Pass with First class");
 	    else  
 		System.out.println("Pass with Second class");
	}
    else
    System.out.println("Fail as at least one subject has less than 35 marks");
     s1.close();
	}
}
