package package1;

public class Assignment18 {
	public static void main(String[] args) {
		boolean username = true;
		boolean password = true;
		boolean role_admin = true;
		boolean role_user = true;    
		     if (username == false)
             {if (password == true)
             {if (role_admin == false) 
                 System.out.println("Full Access");
             else if (role_user == false)
            	 System.out.println("Limited Access");
             else
            	 System.out.println("Guest Access");
             }
             else 
            	 System.out.println("Wrong password");
             }
             else
            	 System.out.println("Invaild username");
             }
}