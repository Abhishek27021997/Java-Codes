
public class Throw {
    
	public static void throwExample(int stuage, int stuweight){
		if(stuage< 18 && stuweight< 40 ) {
			throw new ArithmeticException("Student is not eligible for Registration");
		}
		else {
			System.out.println("Student is Eligible for Registration");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Registration process:");
		throwExample(17,41);
		System.out.println("Have a nice day");
			
	}

}
