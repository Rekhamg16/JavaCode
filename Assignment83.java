package package2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Assignment83 {
public static void main(String[] args) {
	ArrayList<String>employeenames = new ArrayList<String>();
	employeenames.add("E");
	employeenames.add("B");
	employeenames.add("C");
	employeenames.add("D");
	employeenames.add("A");
	System.out.println("1. Arraylist employee names:"+employeenames);
	Collections.sort(employeenames);
	System.out.println("2.collection sort list:"+ employeenames);
	Collections.reverse(employeenames);
	System.out.println("3. collection reverse list:"+ employeenames);
	employeenames.contains("C");
	System.out.println("4. IN list contains c:"+ employeenames.contains("C") );
	Collections.shuffle(employeenames);;
	System.out.println("5.collection shuffle list:"+ employeenames);
   Collection<Integer>salary = new ArrayList<Integer>();
   salary.add(2000);
   salary.add(1000);
   salary.add(4000);
   System.out.println("6. Collection list of employee salary:"+salary);
   Collections.max(salary);
   System.out.println("7. Maximum salary of empolyee:"+Collections.max(salary));
   Collections.min(salary);
   System.out.println("8. Minimum salary of empolyee:"+Collections.min(salary));
     
	
	
	
}
}