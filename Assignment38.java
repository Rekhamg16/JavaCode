package package1;

class Top {
	Top (int a, int b) 
	 {
		this("rekha");
	System.out.println("This is my Top program 1");
	}
	 Top (String a)
	 {
    System.out.println("This is my Top program 2");
}
}
class Sub1 extends Top {
	Sub1 (int b, int c) 
	 {
		this(4,3.5);
	System.out.println("This is my Sub program 1-1");
	
	}
	Sub1 (int b, double c) 
	 {
		super(4, 4);
	System.out.println("This is my Sub program 1-2");
	}
}
class Sub2 extends Sub1 {
		Sub2 (int b) 
		 {
			super(2,3);
		System.out.println("This is my Sub program 2");
		}
}
public class Assignment38 {
public static void main(String[] args) {
	new Sub2(10);
	}
}