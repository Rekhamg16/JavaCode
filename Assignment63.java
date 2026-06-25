package package2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);			
		String []name  = new String [4];
		for(int i=0;i<4;i++) {
			System.out.println("enter name :"+i);
			name [i]=s1.next();
		}
        System.out.println(Arrays.toString(name));
        String [] name1=new String[4];
        for(int i=0,j=4-1;i<4;i++,j--)
 {		
         name1[j]=name[i];
         
 }
     System.out.println("Input Array->"+Arrays.toString(name));
     System.out.println("reverse output Array->"+Arrays.toString(name1));
 s1.close();
	}

}
