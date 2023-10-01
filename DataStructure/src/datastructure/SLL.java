package datastructure;
import java.util.*;

public class SLL {
	 
	Node head;
	int size;
	
	SLL(){
	this.size=0;
	}
	
	
class Node{
		String data;
		Node next;
	
	
	Node(String data){
		this.data=data;
		this.next=null;
		size++;
	}	
}
	
public void addfirst(String data){	                 //AddFirst
	Node newnode=new Node(data);
          if(head==null) {
		   head=newnode;
		   return;
          }
          newnode.next=head;
          head=newnode;
	  }

public void addlast(String data) {                    //AddLast
	Node newnode=new Node(data);
    if(head==null) {
	   head=newnode;
	   return;
    }
     Node currnode=head;
    while(currnode.next!=null) {
    	currnode=currnode.next;
    }
    currnode.next=newnode;
}


public void insertatlocation(String data) {            //Insert At location
	Node newnode=new Node(data);
	   
       Node currnode=head;
       for(int i=0;i<2;i++) {
    	   currnode=currnode.next;
       }
      
       newnode.next=currnode.next;
       currnode.next=newnode;
}


public void deletefirst() {                          //DeleteFirst
	if(head==null) {
		   System.out.println("List is Empty");
		   return;
	    }
	size--;
	head=head.next;
	
}

public void deletelast() {                           //DeleteLast
	if(head==null) {
		   System.out.println("List is Empty");
		   return;
	    }
	size--;
	if(head.next==null) {
		head=null;
		return;
	}
	
	Node firstnode=head;
	Node secondnode=head.next;
	while(secondnode.next!=null) {
		secondnode=secondnode.next;
		firstnode=firstnode.next;
	}
	firstnode.next=null;
}


public void DeleteAtPosition() {                   //DeleteAtPosition
	size--;
	if(head==null) {
		System.out.println("List is Empty");
		return;
	}
	
	Node firstnode=head;
	Node secondnode=head.next;
	for(int i=0;i<2;i++) {
		secondnode=secondnode.next;
		firstnode=firstnode.next;
	}
	firstnode.next=secondnode.next;
	
}
public void printlist() {                           //PrintList
	if(head==null) {
		   System.out.println("List is empty");
		   return;
	    }
	Node currnode=head;
    while(currnode!=null) {
    	System.out.print(currnode.data + " >");
    	currnode=currnode.next;
    }
    System.out.println();
}

public int getsize() {                              //GetSize
	return size;
}

	         
	  public static void main(String args[]) {
		  SLL obj1=new SLL();
		  obj1.addfirst("Best");
		  obj1.addfirst("the");
		  obj1.addfirst("is");
		  obj1.addfirst("abhishek");
		  obj1.printlist();
		  
		  obj1.addlast("and");
		  obj1.addlast("better");
		  obj1.printlist();
		  
		  obj1.insertatlocation("check");
		  obj1.printlist();
		  
		  System.out.println(obj1.getsize());
		  
		  obj1.DeleteAtPosition();
		  obj1.printlist();
	  }
}

