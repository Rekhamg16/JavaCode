package package1;
import java.util.Scanner;
public class Programm4 {
	public static void main(String[] args) {
	  Scanner s1= new Scanner(System.in);
	  System.out.print("Attendence  > ");
		int a=s1.nextInt();	 
	    //System.out.println("Enter a Grade as A/B/C/D:");
        char grade = 'B'; 
     if (a>=75)
	 {if (grade =='A')
	 {System.out.println("Distingction");}
	 else if (grade =='B')
	 {System.out.println("First Class");}
	 else if (grade =='C')
	 {System.out.println("Second Class");}
	 else
	 System.out.println("Fail due to low Marks");
	 }
	 else
		 {System.out.println("student fail due to low attendence");}
     s1.close();
	}
	}