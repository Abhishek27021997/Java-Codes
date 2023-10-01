import java.util.*;


class customexception extends Exception{
	
	public customexception(String str) {
		super(str);
	}
	
}



public class UserDefinedException {
	
	public static void main(String[] args) {
		try {
			method(13);
		}
		catch(customexception e)
		{
			System.out.println("Caught the exception" + e);
			
		}

	}
	static void method(int age) throws customexception
	{
		if(age<18) {
			throw new customexception("Age is not Valid");
		}
		else
		{
			System.out.println("Eligible for vote");
		}
	}

}
