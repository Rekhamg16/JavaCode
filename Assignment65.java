package package2;
import java.util.Arrays;
public class Assignment65 {
public static void main(String[] args) {
	  int [] c1 =new int [4];
		c1 [0] = 10;
		c1 [1] = 20;
        c1 [2] = 30;
        c1 [3] = 40;
       int [] d1=new int [4];
		d1 [0] = 10;
		d1 [1] = 20;
        d1 [2] = 50;
        d1 [3] = 60;
       boolean b1 = Arrays.equals(c1, d1);
       if(b1)
       {  System.out.println("Arrays c1,d1 are equals");
       }
       else
       {System.out.println("Arrays c1,d1 are not equls");
       }       
}
}