package package1;
class Vegetable{
		void method1()
		{
			System.out.println("Many more vegetables"); 
}
}			
class Fruit extends Vegetable{
	void method1()
	{
		System.out.println("Many more fruits");
		}
	}    
public class Assignment39 {
	public static void main(String[] args) {
	Fruit f1 = new Fruit();
		f1.method1();
	}
}