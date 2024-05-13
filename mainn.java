package oop;

public class mainn {
	public class Main {
	    public static void main(String[] args) {
	        queues queue = new queues(5);
	        
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        
	        System.out.println(queue.dequeue()); // Output: 1
	      
	        
	        queue.enqueue(4);
	        queue.enqueue(5);
	        
	        System.out.println(queue.dequeue()); // Output: 2
	      
	}
}
}