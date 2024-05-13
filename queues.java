package oop;

public class queues {
	
	    private Stack stack1;
	    private Stack stack2;
	    
	    public void QueueUsingStacks(int capacity) {
	        stack1 = new Stack(capacity);
	        stack2 = new Stack(capacity);
	    }
	    
	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }
	    
	    public boolean isFull() {
	        return stack1.isFull() || stack2.isFull();
	    }
	    
	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue overflow");
	            return;
	        }
	        
	        // Move all elements from stack1 to stack2
	        while (!stack1.isEmpty()) {
	            stack2.push(stack1.pop());
	        }
	        
	        // Push the new element to stack1
	        stack1.push(value);
	        
	        // Move back all elements from stack2 to stack1
	        while (!stack2.isEmpty()) {
	            stack1.push(stack2.pop());
	        }
	    }
	    
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue underflow");
	            return -1;
	        }
	        return stack1.pop();
	    }
	    
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue underflow");
	            return -1;
	        }
	        return stack1.peek();
	    }
}
