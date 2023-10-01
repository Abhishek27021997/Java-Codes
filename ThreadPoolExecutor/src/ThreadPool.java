import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<10;i++) {
			Runnable runname=new MyRunnable("MyWorkerThread:" + i);
			executor.execute(runname);
		} 
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		System.out.println("All requests completed Successfully");

	
		
	}

}
