import java.util.*;

                        Function Overloading


//public class Polymorphism {
//
//	
//	public void method(String a)
//	{	
//		System.out.print(a);
//	}
//	public void method(int b)
//	{	
//		System.out.println(b);
//	}
//	
//	public static void main(String[] args) {
//		
//       Polymorphism obj=new Polymorphism();
//       obj.method("String parameter\n");
//       
//       obj.method(1234);
//		
//	}
//}
    

                      //Function Overriding

//Base Class
class Parent {
	void show() 
	{ 
		System.out.println("Parent's show()"); }
}

//Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override void show()
	{
		System.out.println("Child's show()");
	}
}

//Driver class
class Polymorphism {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}  

