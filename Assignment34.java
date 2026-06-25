package package1;
 class Subject  { 
	 static void show() {
	        System.out.println("Parent: static method (Class level)");}
}//parent class
class English extends Subject {
	static void e1 ()
	{ System.out.println("English e1 subject-Static");}
	 void e2 ()
	{ System.out.println("English e2 subject-Non Static");}
}
class Maths extends  Subject {
	static void m1 ()
	{ System.out.println("Maths m1 subject-Static");}
	 void m2 ()
	{ System.out.println("Maths m2 subject-Non Static");}
}
class Science extends Subject {
	static void s1 ()
	{ System.out.println("Science s1 subject-Static");}
	 void s2 ()
	{ System.out.println("Science s2 subject-Non Static");}
}
public class Assignment34 {
public static void main(String[] args) {
    English  a1 = new English();
    Maths a2 = new Maths();
    Science a3 = new Science();
         a1.e2();
         a2.m2();
         a3.s2();
         English.e1();
         Maths.m1();
         Science.s1();
         Subject.show();
}
}