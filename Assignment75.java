package package2;
import java.util.ArrayList; import java.util.Arrays;
import java.util.List;
public class Assignment75 {
	public static void main(String[] args) {
		ArrayList<Integer> d1 = new ArrayList<Integer>();
		d1.add(45); 		d1.add(50);
		d1.add(90); 		d1.add(100);
		d1.add(1, 56);
		System.out.println("Arraylist Integer d1:"+d1);
		boolean n1 = d1.contains(50);
		System.out.println("d1 contains 50:"+n1);
		List<Integer> d11=Arrays.asList(45,90,100,75);
		System.out.println("Arraylist Integer d11:"+d11);
		boolean n2 = d1.containsAll(d11);
		System.out.println("d1 contains All d11:"+n2);
		for(int i=0;i<d1.size();i++)
	       {System.out.println("Get - d1("+i+") :"+d1.get(i));}
		ArrayList<Integer> d2 = new ArrayList<Integer>();
		d2.add(30);
		d2.add(78);
		d2.addAll(d1);
		System.out.println("list addAll d2:"+d2);
		d2.removeAll(d2);
		System.out.println("Removeall from d2:"+d2);
		ArrayList<String> d3 = new ArrayList<String>();
		d3.add("Ram");
		d3.add("Sham");
		boolean n3 = d2.equals(d3);
		System.out.println("d2 and d3 equals:"+n3);
		d3.remove(0);
		System.out.println("remove from d3:"+d3);
		d3.remove("Sham");
		System.out.println("remove object from d3:"+d3);
		d1.clear();
		System.out.println("The clear d1:"+d1);
       boolean n4 = d1.isEmpty();
       System.out.println("d1 is empty:"+n4);
    }
}