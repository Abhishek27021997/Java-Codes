package datastructure;

import datastructure.SLL.Node;

public class DLL {

	Node head=null;
	Node tail=null;
	
class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

public void addfirstDLL(int data) {                        //Add First
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		tail=newnode;
		return;
	}
   head.prev=newnode;
   newnode.next=head;
   head=newnode;
}

public void addlast(int data) {                           //Add Last
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		tail=newnode;
		return;
	}
	tail.next=newnode;
	newnode.prev=tail;
	tail=newnode;
}

public void InsertAtPosition(int data) {                //InsertAtPosition
	 Node newnode=new Node(data);
	 if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
	 Node temp=head;
	 Node ptr=head.next;
	 
	 for(int i=1;i<3;i++) {
		 temp=temp.next;
		 ptr=ptr.next;
	 }
	 newnode.prev=temp;
	 newnode.next=ptr;
	 temp.next=newnode;
	 ptr.prev=newnode;
		
}
	
public void DeleteAtFirst() {                            //DeleteAtFirst
	if(head==null) {
	     System.out.println("List is Empty");
	      return;
	}
	head=head.next;
	
}

public void DeleteAtLast() {                            //DeleteAtLast
	if(head==null) {
	     System.out.println("List is Empty");
	      return;
	}
	Node temp=tail;
	temp=temp.prev;
	temp.next=null;
	
}

public void DeleteAtPosition() {                      //Delete At Position
	if(head==null) {
	     System.out.println("List is Empty");
	      return;
	}
	Node temp=head;
	Node ptr=head.next;
	for(int i=1;i<2;i++) {
	    temp=temp.next;
		ptr=ptr.next;
		
	}
	temp.next=ptr.next;
	ptr.prev=temp;
	
}

public void printlist() {                                 //PrintList
	
	    Node currnode=head;
	    while(currnode!=null){
		System.out.print(currnode.data + " > ");
		currnode=currnode.next;
		}
	    System.out.println();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DLL obj1=new DLL();
       obj1.addfirstDLL(25);
       obj1.addfirstDLL(15);
       obj1.addfirstDLL(16);
       obj1.printlist(); 
       
       obj1.addlast(40);
       obj1.printlist(); 
       
       obj1.InsertAtPosition(30);
       obj1.printlist();
       
//       obj1.DeleteAtFirst();
//       obj1.printlist();
//       
//       obj1.DeleteAtLast();
//       obj1.printlist();
       
       obj1.DeleteAtPosition();
       obj1.printlist();
    
	}

}
