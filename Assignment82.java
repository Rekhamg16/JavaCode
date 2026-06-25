package package2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Assignment82 {
public static void main(String[] args) {
	       Collection<Integer>marks = new ArrayList<Integer>();
	       marks.add(50);
	       marks.add(65);
	       marks.add(80);
	       marks.add(92);
	       marks.add(75);
	       System.out.println("1.Collection marks list:" +marks);
	       Iterator<Integer>i1=marks.iterator();
	       System.out.println("2. Iteratinglist:" +marks);
	       while (i1.hasNext()) {
	    	   System.out.println(i1.next()); }
	       Collection<Integer>Numbers = new ArrayList<Integer>();
	       Numbers.add(45);
	       Numbers.add(52);
	       Numbers.add(60); 
	       System.out.println("3.Collection Numbers list:" +marks);
	        marks.addAll(Numbers);
	       System.out.println("4. The addAll Numbers and marks list:" +marks);
	       marks.contains(80);
	       System.out.println("5.In the marks list contains 80 :"+ marks.contains(80));
	       System.out.println("6.The Numbers and marks list size:" +marks.size());
	       System.out.println("7.In the marks list contains all Numbers:" +marks.containsAll(Numbers));
	       Collection<Integer> marks1= new ArrayList<Integer>(Numbers);
	       System.out.println("8.Is marks1 equals to Numbers:"+Numbers.equals(marks1));
	       marks.remove(65);
	       System.out.println("9.In the marks list remove numbers 65:" +marks);
	       marks.removeAll(Numbers);
	       System.out.println("10.In the Numbers list removeall marks :" +marks);
	       marks.clear();
	       System.out.println("11.Is marks list clear :"+marks);
	       System.out.println("12.The marks and Numbers list isempty :" +marks.isEmpty());
	       
	       
	       
	      
	       
	       
	       
	       
	       
	       
}       
}
