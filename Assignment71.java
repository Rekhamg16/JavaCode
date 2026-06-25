package package2;
import java.util.Arrays;
public class Assignment71 {
	public static void main(String[] args) {
		String b = "i love automation class so much";
		String [] words =b.split(" ");
		System.out.println("words array is : "+Arrays.toString(words));
		int arrayLength = words.length; 
		System.out.println("No of words in array is: "+arrayLength);
		String [] reverswords=new String[arrayLength];
		for(int i=0,j=(arrayLength-1);i<arrayLength;i++,j--)
         {
			reverswords[j]=words[i];  
	 }
	     System.out.println("Input Array->"+Arrays.toString(words));
	     System.out.println("Reverse output Array->"+Arrays.toString(reverswords));
	}
}
	