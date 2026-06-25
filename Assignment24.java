package package1;
import java.util.Scanner;

public class Assignment24 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("subjects A:-  ");
		int a=s1.nextInt();
		System.out.print("subjects B:-  ");
		int b=s1.nextInt();
		System.out.print("subjects C:-  ");
		int c=s1.nextInt();
		int sum = a+b+c;
		double avg=sum/3;
		System.out.println("sum of 3 numbers:= >  " +sum);
		System.out.println("Average of 3 numbers:= >  " +avg);
		s1.close();
	}
}
