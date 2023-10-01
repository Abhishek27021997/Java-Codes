import java.util.*;

public class ArrayExceptions {
 public static void main(String args[]) {
	  try { 
		  int arr[]=new int[7];
	   arr[14]=10/5;
	   System.out.println("Last statement of try block");
	  }
	  catch(ArithmeticException e){
		  System.out.println("AE");
	  }
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("AB");
	  }
catch(Exception e){
	System.out.println("E");
	  }
	  System.out.println("statement of try block");
 }
}
