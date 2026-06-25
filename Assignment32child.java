package package1;

public class Assignment32child extends Assignment32 {
	static void child1()
	{ System.out.println("child 1");}

	 void child2()
	{ System.out.println("child 2");
	}
     public static void main(String[] args) {
    	 parent1();
    	 parent2();
    	 child1();
    	 Assignment32child a1 =new Assignment32child();
    	 a1.child2();
	
}
}
