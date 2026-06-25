package package2;
abstract class  Gg {
	  abstract void tea();
	  {System.out.println("Abstract class");
		}
	  void milk()
			{System.out.println("Abstract milk");}
}
 class Hh extends Gg
	{
		public void tea() 
		{
		System.out.println("the real logic here-tea");
		}
	}
public class Assignment46 {
	 public static void main(String[] args) {
			Hh b1 = new Hh();
			b1.tea();
			b1.milk();
		}

}
