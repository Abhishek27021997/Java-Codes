import java.io.IOException;
import java.util.*;



//PROGRAM-3  Try-Catch Code

public class Exception1 {
	public static void main(String[] args) {
        Exception1 obj=new Exception1();
        obj.division();
        System.out.println("Main Program Terminating");
    }
	
	
	public void division() {
     	int quotient=0;
	    int totalSum=200;
		int totalNumber=50;
       
        System.out.println("Computing Division.");
        try{
            quotient  = totalSum/totalNumber;
            System.out.println("Result is : "+quotient);
        }
        catch(Exception e){
        	
            System.out.println("Exception : "+ e.getMessage());
        }
        finally{
            if(quotient != -1){
                System.out.println("Finally Block Executes");
                System.out.println("Result : "+ quotient);
            }else{
                System.out.println("Finally Block Executes. Exception Occurred");
            }
            
        }
    }
}


//PROGRAM-4   Throw-Throws Code


//public class Exception1 {
//
//	public static void main(String[] args) {
//        try{
//            float result;
//            
//           result= division(100,6);
//           result  = division(100,0);
//            System.out.println("result : "+result);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Exception : "+ e.getMessage());
//        }
//    }
//	
//    public static int division(int totalSum, int totalNumber) throws ArithmeticException{
//        int quotient = -1;
//        System.out.println("Computing Division.");
//        try{
//            if(totalNumber == 0){
//                throw new ArithmeticException("Division attempt by 0");
//            }
//            quotient  = totalSum/totalNumber;
//            
//        }
//        finally{
//            if(quotient != -1){
//                System.out.println("Finally Block Executes");
//                System.out.println("Result : "+ quotient);
//            }else{
//                System.out.println("Finally Block Executes. Exception Occurred");
//            }
//            
//        }
//        return quotient;
//    }
//}


