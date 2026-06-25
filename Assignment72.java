package package2;

public class Assignment72 {
	public static void main(String[] args) {
		StringBuffer m1=new StringBuffer("mom");
		System.out.println(m1.capacity());
		m1.append(" dad");
        System.out.println(m1);
        m1.replace(0, 4, "son");
        System.out.println(m1);
        m1.delete(0, 4);
        System.out.println(m1);
        m1.insert(0, "Daughter");
        System.out.println(m1);
        m1.reverse();
        System.out.println(m1);
}
}
  