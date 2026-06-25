package package1;

class GP{
	static void Book()
	{System.out.println("I want book");}
	}
class P extends GP {
		static void storybook()
		{System.out.println("I want good story book");}
		}
class C extends P {
			void Childbook()
			{System.out.println("I want good child story book");}
			}
class GC extends C {
	void Child()
	{System.out.println("I want good child ");}
	}
public class Assignment33{
public static void main(String[] args) {
	GC a1= new GC();
	C.Book();
	C.storybook();
	a1.Childbook();
	a1.Child();
	}
}