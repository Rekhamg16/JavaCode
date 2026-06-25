package package2;

public class Assignment95 {
	public static void main(String[] args) {
		System.out.println("The number between 1 to 100 dividible by 3 :-");
		for(int i=1;i<=100;i++)
		{if(i%3==0)	
		{System.out.print(i+", ");}
		if (i%20==0)
		{System.out.println();}
	}
		System.out.println("The even no. between 1 to 100 :-");
		for(int i=1;i<=100;i++)
		{if(i%2==0)	
		{System.out.print(i+", ");}
		if (i%20==0)
		{System.out.println();}
	}
		System.out.println("The odd number between 1 to 100  :-");
		for(int i=1;i<=100;i++)
		{if(i%2!=0)	
		{System.out.print(i+", ");}
		if (i%20==0)
		{System.out.println();}
	}
		System.out.println("The number between 1 to 100 not dividible by 4 :-");
		for(int i=1;i<=100;i++)
		{if(i%4!=0)	
		{System.out.print(i+", ");}
		if (i%20==0)
		{System.out.println();}
	}

}
}