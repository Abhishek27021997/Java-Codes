
public class Nested_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	
    	try {
    		
    		try {
    			
    			int arr[]= {1,2,3};
    			 
    			System.out.println(arr[10]);
    		}
    		catch(ArithmeticException e){
    			System.out.println("AE");
    		}
    	}
    	catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AB");
         }
    }   
	catch(Exception e){
			System.out.println("E");
    }
  }
}
