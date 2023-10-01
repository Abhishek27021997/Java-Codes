 class MyRunnable implements Runnable {
	
    public String name;
    
    public MyRunnable(String name) {
    	this.name=name;
    }

    
    
    public void run() {
    	try {
    		System.out.println("Executing:" + name);
    		Thread.sleep(1000);
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
	 
	