package datastructure;
import java.util.*;

public class QueueImpLL {
 
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	static class queue{
		static Node head=null;
		static Node tail=null;
		
		public static boolean isEmpty() {                             //isEmpty
			return head ==null & tail ==null;
		}
		
		
		//ENQUEUE
		public static void add(int data) {
			Node newnode=new Node(data);
			if(tail==null) {
				tail=head=null;
				return;
			}
			tail.next=newnode;
			tail=newnode;
			
		
		}
		
		
		//DEQUEUE
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
				}
			
			int front=head.data;
			if(head==tail) {
				tail=null;
			}
			head=head.next;
			return front;
		}
		
		//PEEK
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
				}

			return head.data;
		}	
	}
	public static void main(String[] args) 
	{
		queue q=new queue();
		 q.add(1);
		 q.add(2);
		 q.add(3);
		 q.add(4);
		 q.add(5);
	    // q.remove();
		 
		 while(!q.isEmpty()) {
			 
			 System.out.println(q.peek());
			 q.remove();
		 }
		 

	}

}
