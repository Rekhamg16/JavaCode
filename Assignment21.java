package package1;

public class Assignment21 {
	static void valid_score(int score)
	{ 
		if (score>=0 && score<=100)
		{System.out.println("score is valid");}
		else
		{System.out.println("score is invalid");}
	}
	static void pass_fail(int score, int pass_score)
	{ 
		if (score>=pass_score)
		{System.out.println("Passed.");}
		else
		{System.out.println("Failed.");}
	}
	static void student(int score, int pass_score, boolean isbonus) 
	{
        if (score >= pass_score && isbonus) 
        {System.out.println("Excellent performance.");} 
        else 
        {System.out.println("Normal performance.");}
    }
	public static void main(String[] args) {
		valid_score(52);
		pass_fail(60,35);
		student(45,35,false);
	}
}
