package package1;

public class Assignment11_2 {
	public static void main(String[] args) 
	{
	    int n = 10;
	    int m = 10;
	    int largest;
	    if(n > m)
	    {
	        largest = n;
	        System.out.println(n + " is largest number");
	    }
	    else if(m > n)
	    {
	        largest = m;
	        System.out.println(m + " is largest number");
	    }
	    else
	    {
	        largest = n;
	        //largest = m;  also correct
	        System.out.println("Both are equal");
	    }
	    if(largest % 2 == 0)
	    {
	        System.out.println("It is even number");
	    }
	    else
	    {
	        System.out.println("It is odd number");
	    }
	}
}