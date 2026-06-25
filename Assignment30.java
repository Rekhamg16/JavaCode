package package1;
import java.util.Scanner;
public class Assignment30 {

	public static void main(String[] args) {
		Scanner p= new Scanner (System.in);
		System.out.print("Enter value of n for which factorial is to be find => ");
		int n =p.nextInt();
		System.out.print("The factorial of number " +n+ " is=> ");
		for (int i=1; i<=n;i++) 
		{
		 if(n%i==0)
		 {System.out.print(i+ " ");	}	
		}
p.close();
}


}
