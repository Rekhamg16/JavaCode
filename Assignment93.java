package package2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
public class Assignment93 {
public static void main(String[] args) {
	List<String>l=Collections.synchronizedList( new ArrayList<>());
	l.add("A");   l.add("C");
	l.add("B");  l.add("D");
	System.out.println("1-print the Arraylist"+l);
		System.out.println("2- The Itertor of  synchronizedList element:-");
	Iterator<String> i = l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());}
	Set<String> set = new HashSet<String>();
	Set<String> synch =Collections.synchronizedSet(set);
	synch.add("E");   
	synch.add("F");
	synch.add("G");
	System.out.println("3-print the set list:"+synch);
		System.out.println("4-The Itertor of  synchronizedset element:-");
	Iterator<String> i1= synch.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());}
	Map<Integer,String>m=new HashMap<Integer,String>();
	Map<Integer,String>synch1=Collections.synchronizedMap(m);
	synch1.put(25, "a");
	synch1.put(30, "b");
	System.out.println("5-print the map element name and value:-"+synch1);
		System.out.println("6- The Itertor of synchronizedMap element:-");
	Iterator<Map.Entry<Integer,String>>pair = synch1.entrySet().iterator();
	while (pair.hasNext()) {
	Map.Entry<Integer,String>enrty= pair.next();
	System.out.println("map key:"+enrty.getKey()+     " ,map value: "+enrty.getValue());}
		
	
	
	
	
	
	
	
	
}

}
