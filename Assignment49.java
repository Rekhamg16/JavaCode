package package2;
interface A49
{ void add(int a,int b);
}
interface A49a extends A49
{ void sub(int a,int b);
}
class A49b implements A49a {
	public void add(int a,int b)
		{int sum = a+b;
	   System.out.println("The addition of " + a +" and "+ b + " is " + sum);
	}
	public void sub(int a, int b)
		{int sub= a-b;
	System.out.println("The substraction of " + a +" and "+ b + " is " +sub );
	}
}
public class Assignment49 {
	public static void main(String[] args) {
		A49b a1 =new A49b();
		a1.add(50, 20);	
		a1.sub(80, 30);
	}
}

