package package2;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment58 {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		String [] name = new String[4];
		int [] srn = new int[4];
		for(int i=0;i<4;i++) 
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
