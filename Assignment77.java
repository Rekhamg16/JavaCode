package package2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Assignment77 {
	public static void main(String[] args) {
		ArrayList<Integer>ID=new ArrayList<Integer>();
		ID.add(1234);		ID.add(1235);
		ID.add(1236);		ID.add(1237);
		ID.add(1238);		ID.add(1239);
		System.out.println("Input Arraylist : "+ID);
		ID.add(1, 1240);
		System.out.println("1. Adding 1240 at index 1 : "+ID);
		ID.remove(2);
		System.out.println("2. Remove integer at index 2 : "+ID);
		boolean a=ID.contains(1237);
		System.out.println("3. To check no 1237 is present or not : "+a);
		Iterator<Integer>c1=ID.iterator();
		System.out.println("4. Itertorion using Iterator :");
		while (c1.hasNext()) 
		{
			System.out.println(c1.next());
		}
		ListIterator<Integer>b1=ID.listIterator();
		System.out.println("5a. Forword ListItertorion using Iterator :");
		while (b1.hasNext()) 
		{
			System.out.println(b1.next());
		}
		System.out.println("5b. Previous ListItertorion using Iterator");
		while (b1.hasPrevious()) 
		{
			System.out.println(b1.previous());
		}
		int b=ID.get(2);
		System.out.println("6. Number at index 2 is : "+b);
		System.out.println("7. Output Arraylist : "+ID);
		}
}