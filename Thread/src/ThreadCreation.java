import java.util.*;


     //THREAD BY EXTEND

//class class1 extends Thread{
//	
//	public void run(){
//		for(int i=0;i<=5;i++) {
//			System.out.println("Hey");
//			try{Thread.sleep(1000);}catch(Exception e) {};
//			
//		}
//	}
//}
//class class2 extends Thread{
//	
//	public void run(){
//		for(int i=0;i<=5;i++) {
//			System.out.println("Hey Baby");
//			try{Thread.sleep(1000);}catch(Exception e) {};
//			
//		}
//	}
//}
//public class ThreadCreation {
//	
//public static void main(String args[]) {
//	class1 obj1=new class1();
//	class2 obj2=new class2();
//    
//	obj1.start();
//	try{Thread.sleep(100);}catch(Exception e) {};
//	obj2.start();
//	
// }
//}



    //IMPLEMENTING RUNNABLE

class A implements Runnable{
	
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Hey");
			try{Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}
class B implements Runnable{
	
	public void run(){
		for(int i=0;i<=3;i++) {
			System.out.println("Hey Baby");
			try{Thread.sleep(999);} catch (Exception e) {}
		}
	}
}
public class ThreadCreation {
	
public static void main(String args[]) {
	A obj1=new A();
	B obj2=new B();
    
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	t1.start();
	try{Thread.sleep(10);} catch (Exception e) {}
	t2.start();
 }
}


