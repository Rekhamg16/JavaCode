package package1;
class Person 
{
	static void p1() {
        System.out.println("Parent: static method 1");}
}
class Teacher extends Person  {
	static void t1() {
 System.out.println("Teacher: static method 2 ");}
}		
class Students extends Person {
	static void s1() {
        System.out.println("Students: static method 3 ");}
}
class Mathematic extends Teacher{
     static void m1() {
    System.out.println("Maths: static method 4 ");}
}
public class Assignment35 {
	public static void main(String[] args) {
	Mathematic.p1();
	Mathematic.t1();
	Mathematic.m1();
	Students.s1();
	Students.p1();
	}

}
