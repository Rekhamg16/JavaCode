package package1;

public class Programm3 {
	public static void main(String[] args) {
	char married='Y'; //input Y as Yes & N as No for married.
	if(married=='N')
		{System.out.println("Driver is married and eiligible.");}
	else
		{
		char gender='F'; //input M for Male & F for Female.
		int age=20;
		if (gender== 'M' && age>=30)
		{System.out.println("Male driver is unmarried and eiligible.");}
		else if (gender== 'F' && age>=25)
		{System.out.println("Female driver is unmarried and eiligible.");}
		else
		{System.out.println("Driver is unmarried and not eiligible.");}
	}
}
}
