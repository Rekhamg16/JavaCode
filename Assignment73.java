package package2;

public class Assignment73 {
	public static void main(String[] args) {
		StringBuilder m1=new StringBuilder("Rekha ");
		System.out.println(m1.capacity());
		m1.append(" Gadihani");
        System.out.println(m1);
        m1.replace(0, 5, "Shiv");
        System.out.println(m1);
        m1.delete(0, 4);
        System.out.println(m1);
        m1.insert(0, "Dnyana");
        System.out.println(m1);
        m1.reverse();
        System.out.println(m1);
}
}