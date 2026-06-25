package package2;

abstract class  Zz {
  abstract void tea();
	{
	System.out.println("Abstract tea");
	}
	 abstract void coffee();
		{
		System.out.println("Abstract coffee");
		}
}
 class Bb extends Zz 
{
	public void tea() 
	{
	System.out.println("here-tea");
	}
	public void coffee() 
	{
	System.out.println("here-coffee");
	}
}
 public class Assignment45{
	 public static void main(String[] args) {
		Zz b1 = new Bb();
		b1.tea();
	}
 }
