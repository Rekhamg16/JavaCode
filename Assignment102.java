package package2;

class Father{
	
	void method()
	{System.out.println("Name of Father: ");
}
}
class Mother extends Father
{
	  void method()
		{super.method();
		  System.out.println("Name of Mother: ");
		  }
	  
	  void method1()
			{
			  System.out.println("Name of son: ");
			  }
	}

public class Assignment102 {
	public static void main(String[] args) {
	{System.out.println("Upcasting:--");
	Father f= new  Mother();
	f.method();
	
	{System.out.println("downcasting:--");
	Mother m = (Mother)f;
	m.method();
 	m.method1();
	}
}
}
}
