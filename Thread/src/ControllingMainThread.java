import java.lang.Thread;
public class ControllingMainThread {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Current thread: " + t );
		
		t.setName("Java Thread");
		t.setPriority(7);   //To Set_Priority
		
		System.out.println("After name change: " + t );
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e) {
				System.out.println("Main Thread interrupted");
			}
		t.getPriority();     //To Get_Priority
		System.out.println(t);
		
	}

}
