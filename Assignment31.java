package package1;
import java.util.Scanner;
public class Assignment31 {

	public static void main(String[] args) {
		Scanner p= new Scanner (System.in);
		System.out.print("Enter value of n for fabonacci series => ");
		int n =p.nextInt();
		int a1 =0;
		int a2=1;
		System.out.print(a1+" ");
		System.out.print(a2+" ");
		for (int i=0; i<n-2;i++) 
		{
		 int a3 = a2+a1;
		 a1=a2;
		 a2=a3;
		 System.out.print(a3+" ");
}
		p.close();
}
}