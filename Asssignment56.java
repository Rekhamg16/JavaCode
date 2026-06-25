package package2;
import java.util.Arrays;
public class Asssignment56 {
	public static void main(String[] args) {
		int [] marks = new int[5];
		marks[0] =50;
		marks[1] =55;
		marks[2] =60;
		marks[3] =65;
		marks[4] =62;
		System.out.println(Arrays.toString(marks));
		String [] subject = new String[5];
		subject[0] ="Marathi";
		subject[1] ="Hindi";
		subject[2] ="Maths";
		subject[3] ="English";
		subject[4] ="Science";
		System.out.println(Arrays.toString(subject));
		char[] srn = new char[5];
		srn[0] ='A';
		srn[1] ='B';
		srn[2] ='C';
		srn[3] ='D';
		srn[4] ='E';
		System.out.println(Arrays.toString(srn));
		System.out.println("\nShivanya result for class 3 as follows:");
		System.out.println("---------------------------------");
		System.out.println("SR\tSubject\t\tMarks");
		System.out.println("---------------------------------");
		for(int i=0;i<=4;i++) {
			System.out.println(srn[i]+ "\t" +subject[i]+ "\t\t" +marks[i]);	
		}
		System.out.println("---------------------------------");
	}
}