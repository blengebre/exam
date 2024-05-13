package oop;

public class stackssss {
	class Stack {
	    private int[] array;
	    private int top;
	    
	    public Stack(int capacity) {
	        array = new int[capacity];
	        top = -1;
	    }
	    
	    public boolean isEmpty() {
	        return top == -1;
	    }
	    
	    public boolean isFull() {
	        return top == array.length - 1;
	    }
	    
	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack overflow");
	            return;
	        }
	        array[++top] = value;
	    }
	    
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack underflow");
	            return -1;
	        }
	        return array[top--];
	    }
	    
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack underflow");
	            return -1;
	        }
	        return array[top];
	    }
	}

}
