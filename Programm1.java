package package1;

public class Programm1 {
	public static void main(String[] args) {
		int a=3648;		    
		if (a>=10000)
		{
			double b=a*20/100; //discount
			double c = a-b; // discounted price
			System.out.println("20% Discount is " +b);
			System.out.println("Bill amount is " +c);
		}
		else if (a>=5000)
		{
			double b=a*10/100; //discount
			double c = a-b; // discounted price
			System.out.println("10% Discount is " +b);
			System.out.println("Bill amount is " +c);
		}
		else if (a>=2000)
		{
			double b=a*5/100; //discount
			double c = a-b; // discounted price
			System.out.println("5% Discount is " +b);
			System.out.println("Bill amount is " +c);
		}
		else
		{
			System.out.println("No Discount");
			System.out.println("Bill amount is " +a);
			
		}
			
	}

}
