package package2;
interface Tt
{ void add(int a,int b);
}
interface Rr 
{ void sub(int a,int b);
}
class Abc implements Tt,Rr {
	public void add(int a,int b)
		{int sum = a+b;
	   System.out.println("The addition of " + a +" and "+ b + " is " + sum);
	}
	public void sub(int a, int b)
		{int sub= a-b;
	System.out.println("The substraction of " + a +" and "+ b + " is " +sub );
	}
}
public class Assignment48 {
	public static void main(String[] args) {
		Abc a1 =new Abc();
		a1.add(10, 20);	
		a1.sub(50, 30);
	}
}