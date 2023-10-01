import java.util.*;

//AutoBoxing example of int to Integer
public class Autoboxing {

	public static void main(String[] args) {
		
		int i=10;
	    
		Integer data=new Integer(i);  //AutoBoxing
		               

		int data2=data.intValue();   //Unboxing
		
		
		System.out.println(data2);
		
	}

}
