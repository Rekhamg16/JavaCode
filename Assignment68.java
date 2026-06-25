package package2;
import java.util.Arrays;
public class Assignment68 {
	public static void main(String[] args) {
		int Alpha         =0;
		int Numericvalues =0;
		int space         =0;
	    int specialcharacter =0;
	    String input = "Flat no @ 12";
	    System.out.println(" String.length:" + input.length());
	    char []a1 = input.toCharArray();
	    System.out.println(Arrays.toString(a1));
	    for(int i =0;i<input.length();i++) {    	     
	boolean b1 = Character.isAlphabetic(a1[i]);
	if(b1)
	{      Alpha++;
	
	} 
	boolean b2 = Character.isDigit(a1[i]);
	if(b2)
	{      Numericvalues++;
	
	}
    boolean b3 = Character.isWhitespace(a1[i]);
	if(b3)
	{     space++;
	
	}
	    }
	System.out.println("Aplhabets in strings are: "+Alpha);
	System.out.println("Numeric in strings are: "+Numericvalues);
	System.out.println("space in strings are: "+space);
	specialcharacter=input.length()-(Alpha+Numericvalues+space);
	System.out.println("special charcter in strings are: "+specialcharacter);
}
}