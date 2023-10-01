import java.util.*;

public class DifferentValuestoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         
            //Entering numerical value
            float n=sc.nextFloat();
            
            //Converting to String
            String str=String.valueOf(n);
            
            System.out.println(n+100);
            System.out.println(str+100);
            
	}

}
  //    Note: many to one(String) = String.valueOf()function.
  //          one to many = Parsing