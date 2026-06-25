package package2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.List;
public class Assignment94 {
	public static void main(String[] args) {
		List<String>singletonlist=Collections.singletonList("Apple");
		System.out.println("singletonlist:-"+singletonlist);
		
		Set<String>singletonset=Collections.singleton("Orange");
		System.out.println("singletonlist:-"+singletonset);
		
		Map<Integer,String>singletonmap=Collections.singletonMap(50, "red");
		System.out.println("singletonlist:-"+singletonmap);
		
		try {
			System.out.println("Modify the singletonlist adding by object");
			singletonlist.add("cherry");
			} catch(UnsupportedOperationException e) {
				System.out.println("Handle the exception");
			}
		
		try {
			System.out.println("Modify the singletonset adding by object");
			singletonset.add("Grapes");
			} catch(UnsupportedOperationException e) {
				System.out.println("Handle the exception");
			}
		try {
			System.out.println("Modify the singletonmap adding by object");
			singletonmap.put(100, "blue");
			} catch(UnsupportedOperationException e) {
				System.out.println("Handle the exception");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
