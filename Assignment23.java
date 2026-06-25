package package1;

public class Assignment23 {
           {
          	System.out.println("This is my constructor");
    }
	static void add(int a,int b)
	{    int c=a+b;
		System.out.println(c);	
		
	}
    static void add(double a,double b)
    {    double c=a+b;
      System.out.println(c);
    }
 
    public static void main(String[] args) {
    	add(50,40);
    	add(50.2,40.5);
    	}
}
