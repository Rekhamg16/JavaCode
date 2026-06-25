package package2;

public class Assignment100 {
	public static void main(String[] args) {
		System.out.println("----1)wideningcasting -----");
		int num = 40;
		double d = num;
		System.out.println("original value of num:"+num);
		System.out.println("double widening value of:"+d);
		
		System.out.println("----2)Narrowingcasting -----");
         double value = 40.5;
         int number = (int)value;
         System.out.println("original value of double:"+value);
 		System.out.println("int  Narrowing value of:"+number);
	}

}
