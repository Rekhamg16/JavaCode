package package2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Assignment90 {
	public static void main(String[] args) {
		ArrayList<String>names =new ArrayList<String>();
		names.add("Rani");	   names.add("Sunita");
	    names.add("Avinash");  names.add("Deepak");
		names.add("Chhaya");
		System.out.println("1-Array list : "+names);
        Collections.sort(names);
        System.out.println("2-collection sort list: "+ names);
        Collections.reverse(names);
        System.out.println("3-collection reverse list: "+ names);
        Collections.shuffle(names);
        System.out.println("4-collection shuffle list: "+ names);         
        Collections.swap(names, 0, 2);
  	  System.out.println("5- Swap Names list : "+names); 
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(10);
		int a =  Collections.binarySearch(numbers,20);
	  	 System.out.println("6-binaryserch the index numbers of 20: "+a);
       System.out.println("7-Numbers list "+numbers);  
	  System.out.println("8- list minimum numbers is :"+Collections.min(numbers)); 
	  System.out.println("9- list minimum numbers is :"+Collections.max(numbers)); 
	  Collections.swap(numbers, 4, 2);
	  System.out.println("10- Swap Numbers list "+numbers);
	 	System.out.println("11- frequency of 10 numbers:  "+Collections.frequency(numbers,10));
		
		
		
		
		
		
}
}