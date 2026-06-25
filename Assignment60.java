package package2;

import java.util.Arrays;

public class Assignment60{
	public static void main(String[] args) {
		int [] Rollno = new int[5];
		Rollno[0] =01;
		Rollno[1] =02;
		Rollno[2] =03;
		Rollno[3] =04;
		Rollno[4] =05;
		System.out.println(Arrays.toString(Rollno));
		String [] name = new String[5];
		name[0] ="Mira";
		name[1] ="Hina";
		name[2] ="Rina";
		name[3] ="Isha";
		name[4] ="Seema";
		System.out.println(Arrays.toString(name));
		char[] initial = new char[5];
		initial[0] ='M';
		initial[1] ='H';
		initial[2] ='R';
		initial[3] ='I';
		initial[4] ='S';
		System.out.println(Arrays.toString(initial));
		
     for(int i=0;i<=4;i++) {
    System.out.println((i+1)+" Stundet: ");	
	System.out.println("My name is:"+name[i]);	
	System.out.println("My Roll no is:"+Rollno[i]);	
	System.out.println("My initial is:"+initial[i]);	
}
}
}