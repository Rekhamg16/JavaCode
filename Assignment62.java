package package2;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment62 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);			
		String []name  = new String [4];
		for(int i=0;i<4;i++) {
			System.out.println("enter name :"+i);
			name [i]=s1.next();
		}
        System.out.println(Arrays.toString(name));
        String [] name1=new String[4];
         for(int i=0;i<4;i++)
 {
         name1[i]=name[i];
 }
     System.out.println("Input Array->"+Arrays.toString(name));
     System.out.println("Copied output Array->"+Arrays.toString(name1));
 s1.close();
	}

}
