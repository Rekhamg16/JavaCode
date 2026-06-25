package package1;

public class Assignment27 {
	static int b=100; 	//Static Global Variable
	int c=150;			//Non-Static Global Variable
public static void main(String[] args) {
	int a =20;			//Local Variable
	System.out.println(a);
	a=19;
	System.out.println(a);
	System.out.println(b);
	b=110;
	System.out.println(b);
	Assignment27 c1=new Assignment27();
	System.out.println(c1.c);
	c1.c=160;
	System.out.println(c1.c);
}    
}