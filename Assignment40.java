package package1;
class Father{
	void method()
	{System.out.println("Name of Father");
}
}
class Mother extends Father
{
	  void method()
		{super.method();
		  System.out.println("Name of Mother");
		  }
	}
class Child extends  Mother
{
	  void method()
	{super.method();
		  System.out.println("Name of Child");
	}
	}
public class Assignment40 {
	public static void main(String[] args) {
		Child c1 = new Child();
		  c1.method();
	}     
}


