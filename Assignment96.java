package package2;

public class Assignment96 {
	public static void main(String[] args) {
		System.out.println("The number between 1 to 100 divisible by 3");
		for(int i=1;i<=100;i++)
		{if (i%20==0)
		{System.out.println();}
		if (i%3!=0)
		{continue;}
			System.out.print(i+", ");
		}
		System.out.println("The even number between 1 to 100 ");
		for(int i=1;i<=100;i++)
		{if (i%20==0)
		{System.out.println();}
		if (i%2!=0)
		{continue;}
			System.out.print(i+", ");
		}
		System.out.println("\nThe odd number between 1 to 100 ");
		for(int i=1;i<=100;i++)
		{if (i%20==0)
		{System.out.println();}
		if (i%2==0)
		{continue;}
			System.out.print(i+", ");
		}
		System.out.println("The number between 1 to 100 not divisible by 4");
		for(int i=1;i<=100;i++)
		{if (i%20==0)
		{System.out.println();}
		if (i%4==0)
		{continue;}
			System.out.print(i+", ");
		}
	}

}
