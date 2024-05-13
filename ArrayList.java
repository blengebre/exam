package oop;

import java.util.Arrays;

	    public class ArrayList {
	        int size;
	        int capacity;
	        Object[] array;
	       public ArrayList(){
	           this.array = new Object[capacity];
	       }
	       public ArrayList(int capacity){
	           this.capacity = capacity;
	           this.array = new Object[capacity];
	       } public void delete(int index){

	           Object[] temp = new Object[capacity];

	               for(int i = 0; i<index;i++){
	                   temp[i] = array[i];
	               }
	               size--;
	               for(int i = index; i < size; i++){
	                   temp[i] = array[i+1+1];
	               }
	               this.array = temp;
	            System.out.println(Arrays.toString(temp));
	             
	               }

     
	
   }

