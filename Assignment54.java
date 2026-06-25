package package2;

public class Assignment54 {
	public static void main(String[] args) {
		String c ="shiv";
		System.out.println("Input : "+c);
		System.out.println("Output of replace char: "+c.replace('s','S'));
		String c1 ="My name is shiv";
		System.out.println("Input : "+c1);
		System.out.println("Output of replace string: "+c1.replace("shiv","Dnyana"));
		String c2 ="Seema";
		System.out.println("Input : "+c2);
		System.out.println("Output of replace a-z: "+c2.replaceAll("[a-z]","ab "));
		boolean b1=c1.matches("My(.*)");
        System.out.println("To check sentance '"+c1+"' start with 'My' : "+b1);
        boolean b2=c1.matches("(.*)o");
        System.out.println("To check sentance '"+c1+"' end with 'o' : "+b2);
        boolean b3=c1.matches("(.*)is(.*)");
      System.out.println("To check sentance '"+c1+"' contain word 'is' : "+b3);
      

	}
	

}
