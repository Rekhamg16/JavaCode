package package2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
public class Assignment91 {  
	public static void main(String[] args) {
		ArrayList<String>names =new ArrayList<String>();
		names.add("A");	   names.add("B");
	    names.add("C");  names.add("D");
		System.out.println("List of names:  "+names);
		Collections.addAll(names, "E ", "k");
		System.out.println("collections is addAll with 'E' & 'k': "+names);	
		ArrayList<String>names1 =new ArrayList<String>();
		names1.add("F");	   names1.add("G");
		System.out.println("List of names1:  "+names1);
		   boolean e=     Collections.disjoint(names1, names);
	        System.out.println(e);
		Collections.copy(names,names1);
		System.out.println("collections copy names1 in names: "+names);
       Collections.rotate(names, 2);
        System.out.println("List rotate names:  "+names);
        Collections.fill(names, "f");
		System.out.println("collections is fill with 'f': "+names);
		Collections.replaceAll(names, "f" ,"p");
		System.out.println("collections is fill with 'f': "+names);

}
}