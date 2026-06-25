package package1;
import java.util.Scanner;

public class Assignment25 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter value of a:-  ");
		int a=s1.nextInt();
		System.out.print("Enter value of b:-  ");
		int b=s1.nextInt();
		{ 
			System.out.println(Math.sqrt(a));
			System.out.println(Math.max(a, b));
			System.out.println(Math.min(a, b));
			System.out.println(Math.multiplyExact(a,b));
			System.out.println(Math.subtractExact(a, b));
			System.out.println(Math.addExact(a, b));
			System.out.println(Math.abs(a));}	
			s1.close();
}
}