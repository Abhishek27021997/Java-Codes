import java.util.*;


//                       ABSTRACT CLASS(Program-1)

//abstract class Animal{    //Abstract class does not instantiate.
//
//	public abstract void method1();    //Abstract method  can only be used in an abstract class, and it does not have a body.
//
//	public void method2()
//	{
//		System.out.println("Zzz");
//	}
//}
//
//class pig extends Animal{
//	public void method1() {
//		System.out.println("The pig says: wee wee");
//	}
//}
//
//class Abstraction{
//	public static void main(String[] args) {
//		pig obj=new pig();
//		obj.method1();
//		obj.method2();
//	}
//}


                       //interface(Program-1)               

//  interface Animaleat{
//	  void eat();
//  }
//
//  interface Animaltravel{
//	  void travel();
//  }
//
//  class Animal implements Animaleat,Animaltravel {              //Multiple Inheritance
//
//	  public void eat(){
//		  System.out.println("Animal is eating.");
//	  }
//
//
//     public void travel() {
//    	 System.out.println("Animal is travelling.");
//     }
//  }
//
//  class Abstraction{
//	  public static void main(String[] args) {
//
//		  Animal obj=new Animal();
//		  obj.eat();
//		  obj.travel();
//	  }
//  }
   
                               //Program-2


//interface Polygon {
//	 void getarea(int length,int breadth);
//}
//
////IMPLEMENTING INTERFACES
//class Rectangle implements Polygon{
//	
//	public void getarea(int length,int breadth) {
//		System.out.println("The area of the Rectangle:" + (length*breadth));
//	}
//}
//
//class Abstraction{
//	public static void main(String[] args) {
//		
//		Rectangle obj=new Rectangle();
//		obj.getarea(7,6);
//	}
//}


  
  
  
  




