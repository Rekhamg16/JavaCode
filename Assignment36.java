package package1;

class A {
	A()
	{System.out.println("This my nubmer 1");}
	}
class B extends A {
	B()
	{System.out.println("This my nubmer 2");}
}
class C1 extends B {
     C1 (int a)
    {System.out.println("This my nubmer 3");}
}
class D extends C1 {
	D ()
	{
	super (5);
	{System.out.println("This my nubmer 4");}
	}
}
public class Assignment36 {
public static void main(String[] args) {
	new D();
	
	}
}


