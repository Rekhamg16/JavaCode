package package2;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment88 {
	public static void main(String[] args) {
		try
		{
	    Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter Arrays size:-");
		String[] name = new String[s1.nextInt()];
		for (int i=0;i<=name.length;i++) {
			name [i]=s1.next();
			System.out.println("Please enter value of index:--"+i);
		}
		System.out.println(Arrays.toString(name));
		s1.close();
		}
		catch(NegativeArraySizeException a1) {
			System.out.println("Exception handled");}
		catch(InputMismatchException a2) {
			System.out.println("Exception handled 1");}	
		catch(ArrayIndexOutOfBoundsException a3) {
			System.out.println("Exception handled 2");	}	
	    finally {
	    	System.out.println("It always excuteted");
	    }
}
}