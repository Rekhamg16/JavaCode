package package2;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment87 {
public static void main(String[] args) {
	try {
	Scanner s1 = new Scanner(System.in);
	System.out.println("please enter the size of arrays:-");
	String[]name = new String[s1.nextInt()];
	for (int i=0;i<name.length;i++)
	{
	 System.out.println("please enter the value of at index :"+i);
	 name[i]=s1.next();
	}
	System.out.println(Arrays.toString(name));
	s1.close();	
	}
	catch(NegativeArraySizeException b1)
	{try {
		System.out.println("Rerun the program with positive int for array size");
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter the size of arrays:-");
		String[]name = new String[s1.nextInt()];
		for (int i=0;i<name.length;i++)
		{
		 System.out.println("please enter the value of at index :"+i);
		 name[i]=s1.next();
		}
		System.out.println(Arrays.toString(name));
		s1.close();
	}
		catch(NegativeArraySizeException b2)
		{System.out.println("Rerun the program with positive int for array size");
	}
		
	}
}	
}
