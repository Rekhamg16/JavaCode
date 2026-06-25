package package2;
import java.util.Vector;
import java.util.Enumeration;
public class Assignment79 {
	public static void main(String[] args) {
		Vector<String> names=new Vector<String>();
		names.add("Pooja");
		names.add("Aarti");
		names.addElement("Nilima");
		names.addElement("Varsha");
		System.out.println("1.-vector class add() and addelement() print is:"+ names);
		System.out.println("2.-check the size is:"+ names.size());
		System.out.println("3.-check the capacity is:"+ names.capacity());
		System.out.println("4.-check the contains is:"+ names.contains("Aarti"));
		System.out.println("5.-iterating Enumeration: ");
		Enumeration<String>e1=names.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		System.out.println("6.-print Firstelements:"+   names.firstElement());
		System.out.println("7.-print Lastelements:"+    names.lastElement());
		names.set(3, "Ram");
		System.out.println("8.-Use set method to Repalce -set (3,Ram):"  +names);
		names.insertElementAt("Avi", 0);
		System.out.println("9.-Use InsertElementsAt method is:"  +names);
		names.remove(4);
		System.out.println("10. -Using Remove method remove to 'varsha'name : "  +names);
		names.removeElementAt(2);
		System.out.println("11.- Using RemoveElementAt method to remove index 2 'Aarti' :"  +names);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
