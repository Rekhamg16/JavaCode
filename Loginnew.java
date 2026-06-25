package package1;

public class Loginnew {
	public void Login12(String gmail) {
		if( gmail.endsWith("@gmail.com"))
			{System.out.println("login successful");}
			else {
	            System.out.println("Login Failed: Email must be a @gmail.com account.");}
	}
	
		public void Login123(String email,String password) {
			if (email.endsWith("@gmail.com") && password.length()>6) 
			{System.out.println("login successful ");}
			else {
	            System.out.println("email or password is incorrect ");}
		}
	
		public void Login1234(String email,String password,String OTP) {
			if (email.endsWith("@gmail.com") && password.length()>6 && OTP.length()>4) 
			{System.out.println("login successful ");}
			else {
	            System.out.println("email or password is incorrect or OTP is wrong");}
		}
         public static void main(String[] args) {
			Loginnew b= new Loginnew();
			b.Login12("user@gmail.com");
			b.Login123("user@gmail.com", "abcdelf");
			b.Login1234("user@gmail.com", "abcdelf","12354");
		}

}