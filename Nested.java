package package1;

public class Nested 
{
   public static void main(String[] args) 
   {
	int a = 10;
	int b = 40;
	int c = 30;
      if (a<b)
      {
    	  System.out.println("a samller than b ");
      if(b<c)
    	    System.out.println("b is samller than c");
     else 
      {
    	   System.out.println("b is greater than c ");
      }
      }
      else
      {
    	   System.out.println("a is greater than b");
      }
    }
}
