package package2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Assignment80 {
        public static void main(String[] args) 
        {
            List<String> list= new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("A");
             System.out.println("Arraylist with dublicate->"+list);
             Set<String> s1=new HashSet<String>(list);
             s1.add("E");
             s1.add("F");
            
             
             System.out.println("list convert to set->"+s1);
                        
    
        }
}
