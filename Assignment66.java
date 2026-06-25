package package2;
import java.util.Arrays;
public class Assignment66 {
public static void main(String[] args) {
	   String a1 ="listen";
       String a2 ="silent";
       if (a1.length()==a2.length())
       { 
    	   System.out.println("They can be anagram as both string have same length. -> "+a1.length());
       char [] c1= a1.toCharArray();
       System.out.println("Array of first string is : "+Arrays.toString(c1));
       char [] c2= a2.toCharArray();
       System.out.println("Array of second string is : "+Arrays.toString(c2));
     
       Arrays.sort(c1);
       Arrays.sort(c2);
       
       System.out.println("Sort of first Array is : "+Arrays.toString(c1));
       System.out.println("Sort of second Array is : "+Arrays.toString(c2));
       
       if(Arrays.equals(c1,c2)==true)
       { 
    	   System.out.println("Both strings are anagram.");
       }
       else
       {
    	   System.out.println("Both strings are not anagram as doesnt contain same alphabets.");
       }
       }
       else 
       {
    	   System.out.println("Both strings are not anagram as both string dont have same length.");
    	   }    
}
}