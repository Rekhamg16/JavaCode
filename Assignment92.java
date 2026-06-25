package package2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
public class Assignment92 {
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		l.add("RAM");
		l.add("sham");
		List<String>unmodifiablelist=Collections.unmodifiableList(l);
		System.out.println(unmodifiablelist);
		Set<Integer>l1=new HashSet<Integer>();
		l1.add(10);
		l1.add(20);
		Set<Integer>unmodifiableset=Collections.unmodifiableSet(l1);
		System.out.println(unmodifiableset);
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(25, "a");
		m.put(30, "b");
		Map<Integer,String>unmodifiablemap=Collections.unmodifiableMap(m);
		System.out.println(unmodifiablemap);
		try {
		System.out.println("Modify the unmodifiablelist adding by object");
		unmodifiablelist.add("rani");
		} catch(UnsupportedOperationException e) {
			System.out.println("Handle the exception");
		}
		try {
		System.out.println("Modify the unmodifiableset adding by object");
		unmodifiableset.add(50);
		}catch(UnsupportedOperationException e1) {
			System.out.println("Handle the exception");}
		try {
			System.out.println("Modify the unmodifiablemap adding by object");
			unmodifiablemap.put(40, "c");
			}catch(UnsupportedOperationException e1) {
				System.out.println("Handle the exception");}
	}

}

