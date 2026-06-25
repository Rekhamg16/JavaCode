package package1;

public class Login {
	
	public void Login12(String email){
		 if (email.endsWith("@gmail.com")) 
		 {System.out.println("Login Successful (Email only): Welcome " + email);
		        } else {
		            System.out.println("Login Failed: Email must be a @gmail.com account.");
		        }
		    }
	public void Login123(String email,String password){
		 if (email.endsWith("@gmail.com") && password.length()>5) 
		 {System.out.println("Login Successful");
		        } else {
		            System.out.println("email or password incorrect ");
		        }
		    }
	public static void main(String[] args) {
		Login a = new Login();
		
		a.Login123("user@gmail.com", "abcdef");
        a.Login12("user@gmail.com");
	}
}