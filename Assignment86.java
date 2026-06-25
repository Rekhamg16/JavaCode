package package2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
public class Assignment86 {public static void main(String[] args) {
	Map<Integer,String>empyid=new HashMap<Integer,String>();
	empyid.put(123,"Pallvi");
	empyid.put(124,"Arjun");
	empyid.put(135,"Rahul");
	empyid.put(146,"Manoj");
	System.out.println("1. Empolyee ID and Name of Empolyee:-"+empyid);
     System.out.println("2. Iterating key");
     for(Integer a:empyid.keySet()) {
    	 System.out.println(a);
	
     }
     System.out.println("3. Iterating values");
     for(String b:empyid.values()) {
    	 System.out.println(b);
	
     }
     System.out.println("4. Iterating Entryset");
     for(Map.Entry<Integer,String> c:empyid.entrySet()) {
    	 System.out.println(c);
	
     } 
     System.out.println("5. Iterate key-value pair using iterator");
     Set<Entry<Integer,String>> pair= empyid.entrySet();
     Iterator<Entry<Integer,String>> d= pair.iterator();
     while(d.hasNext()) {
    	 System.out.println(d.next());
	
     }
	
	
	
}

}
