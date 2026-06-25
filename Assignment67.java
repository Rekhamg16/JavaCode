package package2;

import java.util.Arrays;

public class Assignment67 {
        public static void main(String[] args) 
    {
        	int alphacount=0;
            String input="house no is 75";
            System.out.println("Lenght of string is: "+input.length());
            char []c1=        input.toCharArray();
            System.out.println(Arrays.toString(c1));
            for(int i=0;i<input.length();i++)
            {
            boolean b1= Character.isAlphabetic(c1[i]);
            System.out.println(b1);
                    if(b1)
                    {
                    	alphacount++;                  
                    }
            }
            System.out.println("Aplhabates in strings are: "+alphacount);
            if(alphacount==input.length())
            {
                    System.out.println("The input String conssiting of alphabes only.");
            }
            else
            {
                    System.out.println("The input String NOT conssiting of alphabes only.");
            }
    }
}