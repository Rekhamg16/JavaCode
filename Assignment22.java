package package1;
public class Assignment22 {
	public static void main(String[] args) {
	    int a = 65; //Marks
	    int a1 = 0;

	    if (a >= 0 && a <= 100) 
	    {
	        if (a >= 75)
	        {  a1 = 1; }
	        else if (a >= 60) 
	        {  a1 = 2;  } 
	        else if (a >= 35) 
	        {   a1 = 3;	 } 
	        else 
	        {a1 = 4; }
	    
	
        
	    System.out.println("Case: " + a1);
	 
	    switch(a1)
	    {      
	    	case 1:	System.out.println("Pass with Distingstion");
	        		break;
	    	case 2:  System.out.println("Pass with First class");
	    	         break;
	    	case 3:  System.out.println("Pass with Second class");
	    	          break;
	    	case 4:   System.out.println("Fail");
		              break;
			}		
	    }
		else
			System.out.println("Enter Correct Mark");
}
}