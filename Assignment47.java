package package2;
class Gp1    //Grandparent
{       static void method3()//CM
        {System.out.println("Method 3");}
        void method4()//CM
        { System.out.println("Method 4"); }
}
abstract class Prnt1 extends Gp1 //parent
{
	 abstract void add(int a, int b);
}
class Chld extends Prnt1 {//Child
void add(int a, int b) {
    int sum = a + b;
    System.out.println("Child Implementation - Sum of " + a + " and " + b + " is: " + sum);
}
}
public class Assignment47{
public static void main(String[] args) {
	Chld c1 = new Chld();
	c1.add(50, 20);
	c1.method4();
}
}