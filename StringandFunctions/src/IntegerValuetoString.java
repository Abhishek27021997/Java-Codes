
import java.util.Scanner;

public class IntegerValuetoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the Integer:");

            //Entering numerical value
            int n=sc.nextInt();

            //Converting to String(Two Ways

        //  String str=String.valueOf(n);                 //First Way
            String str=Integer.toString(n);               //Second Way
            
            System.out.println(n+100);
            System.out.println(str+100);
            
	}

}
  //    Note: many to one(String) = String.valueOf()function.
  //          one to many = Parsing