package package2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Assignment81 {
	public static void main(String[] args) {
		Set<String>f1=new HashSet<String>();
		f1.add("Pen");
		f1.add("pencil");
		f1.add("Eraser");
		f1.add("Cryaon");
		System.out.println(f1);
		List<String>s1=new ArrayList<String>(f1);
		System.out.println("convert set into list:"+ s1);
		s1.add("Red");
		s1.add("Blue");
		s1.add(1,"yellow");
		System.out.println(s1);
		
		
		
		
		
	}	
	
	


}
