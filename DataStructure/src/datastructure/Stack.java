package datastructure;

public class Stack {
    
	Node top;
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void push(int data) {
		Node newnode=new Node(data);
		newnode.next=top;
		top=newnode;
	}
	
	public void pop() {
		
		int temp=top.data;
		top=top.next;
		return;
	}
	
	
	public void peek(){
		
		Node currnode=top;
		System.out.println(currnode.data);
	}
	
	
	public void printlist() {
		if(top==null) {
			System.out.println("List is Empty");
			return;
		}
		Node currnode=top;
		while(currnode!=null) {
			
			System.out.print(currnode.data + " > ");
			currnode=currnode.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Stack obj=new Stack();
		obj.push(11);
		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.printlist();
		
		obj.pop();
		obj.printlist();
        
		obj.peek();

		
	}

}
