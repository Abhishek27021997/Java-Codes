import java.util.*;



class counter{
	int count ;
	
	public synchronized void increment() {
		count++;
	}
}

class Synchronization
{
	public static void main(String args[])throws Exception {
		counter c=new counter();
		
		
		Thread t1=new Thread(new Runnable() 
		{
			public void run() 
			{
				for (int i=0;i<1500;i++)
				{
					c.increment();
				}
			}
		});
		Thread t2=new Thread(new Runnable() 
		{
			public void run() 
			{
				for (int i=0;i<1000;i++)
				{
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}


//class counter{
//	int count;
//	
//	public synchronized void increment() {
//		count++;
//	}
//
//}
//
//class Synchronization
//{	
//	public static void main(String args[]) throws Exception,ArithmeticException{
//		counter c= new counter();
//		
//		
//		Thread t1=new Thread(new Runnable() 
//		{
//			public void run() 
//			{
//				for(int i=1;i<=1000;i++) 
//				{
//					c.increment();
//				}
//			}
//			
//		});
//		Thread t2=new Thread(new Runnable() 
//		{
//			public void run() 
//			{
//				for(int i=1;i<=1000;i++) 
//				{
//					c.increment();
//				}
//			}
//			
//		});
//		Thread t3=new Thread(new Runnable() 
//		{
//			public void run() 
//			{
//				for(int i=1;i<=1000;i++) 
//				{
//					c.increment();
//				}
//			}
//			
//		});
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		t1.join();
//		t2.join();
//		t3.join();
//		System.out.println(c.count);
//	}
//}
