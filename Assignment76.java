package package2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
public class Assignment76 {
	public static void main(String[] args) {
		ArrayList<String>names =new ArrayList<String>();
		names.add("Rani");	   names.add("Sunita");
	    names.add("Avinash");  names.add("Deepak");
		names.add("Chhaya");
		 System.out.println(names);
		Iterator<String>a1=names.iterator();
		System.out.println("Itertorion using Iterator");
			while (a1.hasNext()) 
		{System.out.println(a1.next());}
		ListIterator<String>b1=names.listIterator();
		System.out.println("Forword ListItertorion using Iterator");
		while (b1.hasNext()) 
		{System.out.println(b1.next());}
		System.out.println("Previous ListItertorion using Iterator");
		while (b1.hasPrevious()) 
		{System.out.println(b1.previous());}
		System.out.println("Modification:");
		System.out.println(names);
		while (b1.hasNext()) {
			String name = b1.next();
            if (name.equals("Rani")) {
                b1.add("Priya");
                System.out.println("Name Priya added after Rani."); }
            if (name.equals("Avinash")) {
	              b1.remove();
	              System.out.println("Name Avinash Removed.");
            }
	        if (name.equals("Sunita")) {
	              b1.set("Suman");
	              System.out.println("Name Sunita replaced with Suman.");
	        }
	    }
			  System.out.println(names);
}
}