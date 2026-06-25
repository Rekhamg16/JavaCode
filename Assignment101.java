package package2;

public class Assignment101 {
	public static void main(String[] args) {
		System.out.println("----1)wideningcasting -----");
		byte bvalue = 35;
		int ivalue  = bvalue;
		System.out.println("original value of byte:- "+bvalue);
		System.out.println("int  value converting to  byte:- "+ivalue);
		System.out.println("----2)Narrowingcasting -----");
		long longvalue = 2000l;
		byte bytevalue  =(byte) longvalue;
		System.out.println("original value of long:- "+longvalue);
		System.out.println("byte value converting to long:- "+bytevalue);
		
	}
}
