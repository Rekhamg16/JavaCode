package package1;

public class Apple {
	Apple(double a)
		{System.out.println("This is 1 apple");
		}
	Apple(int a){
	  this();
	System.out.println("This is 2 apple");
	}
	Apple(){
	this(50.6);
	System.out.println("This is 3 apple");
	}
	public static void main(String[] args) {
		new Apple(50);
		}

}
