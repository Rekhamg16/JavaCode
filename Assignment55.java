package package2;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment55 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your input=>");
		String input = s1.next();
		char [] output = input.toCharArray();
		System.out.println(Arrays.toString(output));
		for(int i=0;i<input.length();i++)
		{System.out.println(output[i]);
			
		}
		s1.close();
	}

}
