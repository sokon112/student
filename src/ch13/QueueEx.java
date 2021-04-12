package ch13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("박보검");
		queue.offer("송민호");
		queue.offer("조인성");
		queue.offer("송중기");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
