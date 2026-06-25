package package2;
import java.util.LinkedList;
public class Assignment97 {
public static void main(String[] args) {
	LinkedList<String>link=new LinkedList<String>();
	link.add("Tea");
	link.add("coffee");
	System.out.println("linkedlist list:"+link);
	link.addFirst("milk");
	System.out.println("1- after adding frist the linkedlist list is:"+link);
	link.addLast("greentea");
	System.out.println("2- after adding last the linkedlist list is:"+link);
	link.offer("juice");
	System.out.println("3 -after offer list:"+link);
	System.out.println("4- get index list element:"+link.get(2));
	System.out.println("5- get first list element:"+link.getFirst());
	System.out.println("6-get peek element:"+link.peek());
	String head=link.poll();
	System.out.println("7-remove head element:"+head);
	System.out.println("8- remove head element after list:"+link);
   String frist=	link.removeFirst();
	System.out.println("9- remove frist element :"+frist);
	System.out.println("10- remove frist element after list:"+link);
	String last =link.removeLast();
	System.out.println("11- remove last element :"+last);
	System.out.println("12- remove last element after list:"+link);
}
}
