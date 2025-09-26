package Collections;

import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq =new PriorityQueue<>();
		
		pq.add("Java");
		
		pq.add("JavaScript");
		
		pq.add("sql");
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		

	}

}