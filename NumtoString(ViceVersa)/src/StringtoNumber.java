import java.util.*;

//To convert 
public class StringtoNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String(Integer) to which you want to convert: ");
		String str=scan.nextLine();
		
		//Converting String into integer using Integer.parseInt()
        int i=Integer.parseInt(str);
        //Converting String into integer using Long.parseLong()
        float l=Float.parseFloat(str);
        
        System.out.println(i);
        System.out.println(l);
	}

}
