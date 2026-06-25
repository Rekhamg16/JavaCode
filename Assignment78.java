package package2;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
public class Assignment78 {
	public static void main(String[] args) {
		Set<String>s1=new HashSet<String>();
		s1.add("amit");    s1.add("sumit");
	    s1.add("vinit");      s1.add("tina");
		System.out.println(s1);
		s1.add("Nitin");
		System.out.println("1. Adding  vlaue;"+ s1);
		System.out.println("2. Adding dupalicat element 'sumit': " + s1.add("sumit"));
		System.out.println("3. Print all element:"+ s1);
		System.out.println("4. Check the size of set:" + s1.size());
		System.out.println("5. Check the elements present in set 'vinit': "+ s1.contains("vinit"));
		System.out.println("6. Iterat using iterator method:");
		Iterator<String>iterator=s1.iterator();
		while(iterator.hasNext())
		{System.out.println(iterator.next()+" ");}
		Set<String>s2=new HashSet<String>();
		s2.add("amit");
		s2.add("sumit");
		s2.add("vinit");
		System.out.println("7. s2 set print:"  + s2);
		System.out.println("8. Does s1 set present all elements of s2:" + s1.containsAll(s2));
		System.out.println("9. Is s1 set is equls to s2 set:"+ s1.equals(s2));
		s2.addAll(s1);
		System.out.println("10. The adding s2.addAll(s1) set s2 is:"+ s2);
		s2.remove("vinit");
		System.out.println("11. The removeing vinit set s2 is:"+ s2);
		s2.removeAll(s2);
		System.out.println("12. The removeall name in set s2 is:"+ s2);
		s2.isEmpty();
		System.out.println("13. The set s2 isEmpty:"+ s2);
		s1.clear();
		System.out.println("14. The set s1 Clear allname is:"+ s2);
		
		
		
		
		
		
		
		
		
	}

}
