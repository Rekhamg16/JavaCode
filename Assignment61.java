package package2;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment61 {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter size of array");
		int a=s1.nextInt();
		String [] name = new String[a];
		int [] rollno = new int[a];
		char [] initial= new char[a];
		for(int i=0;i<a;i++) 
		{ 
			System.out.println("Enter "+(i+1)+ " student name");
			name [i]= s1.next();
			System.out.println("Enter "+(i+1)+ " student roll no");
			rollno [i]= s1.nextInt();	
			System.out.println("Enter "+(i+1)+ " student initial");
			initial[i] = s1.next().charAt(0);
		}
		System.out.println("OUTPUT:=>");
		 for(int i=0;i<a;i++) {
			    System.out.println((i+1)+" Stundet: ");	
				System.out.println("My name is:"+name[i]);	
				System.out.println("My Roll no is:"+rollno[i]);	
				System.out.println("My initial is:"+initial[i]);	
			}
	s1.close();
	}
}
