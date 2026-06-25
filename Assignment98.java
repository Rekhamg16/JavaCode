package package2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Assignment98 {
	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.offer(20);
		pq.add(30);
		System.out.println("PriorityQueue"+pq);
		System.out.println("PriorityQueue list peek no.:"+pq.peek());
		System.out.println("PriorityQueue size is:"+pq.size());
		System.out.println("PriorityQueue contains 30:-"+pq.contains(30));
		Iterator a = pq.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		System.out.println("PriorityQueue after adding poll:-"+pq.poll());
		boolean b = pq.remove(10);
		System.out.println("using remove method:"+b);
		System.out.println("PriorityQueue after remove and poll:-"+pq);
	    pq.clear();
		System.out.println("PriorityQueue after clear isempty:-"+pq.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
	}

}
