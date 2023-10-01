import java.util.*;


                                // Program1:-ASSCI Java Program

//public class Solution 
//{  
//public static void main(String[] String)   
//  {  
//int var1 = 'A';  
//int var2 = 'a';  
//System.out.println("The ASCII value of a is: "+var1);  
//System.out.println("The ASCII value of b is: "+var2);  
//  }  
//}

                              //Program2: One Dimensional Program 

//public class Solution
//{
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int arr[]=new int[n];
//		
//		//Entering the Elements
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//		System.out.println(arr[i]);
//		}	
//	}	
//}
 
                                 //Program3.1: Double Dimensional Array Basic Program

//class Solution{
//
//public static void main(String[]args) {
//int[] mark1= {21,22,23};
////Student 1  //Student2
//int[][] mark2= {{21,25,29},   {24,27,23}};
//System.out.println(mark1[1]);
////Student No.  //Address Block
//System.out.println(mark2[0]           [2]);
//}
//}

                                   //Program3.2:Two Dimensional Program

//public class Solution
//{
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int row=sc.nextInt();
//		int column=sc.nextInt();
//		
//		int arr[][]=new int[row][column];
//		
//		System.out.println("Enter the Element:");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<column;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("All Element:");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<column;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}	
//	}
//}

                                //Program4:  isAnagram(Matching 2 Strings char is same or not)


//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//   static boolean isAnagram(String AB, String BA) {
//	   AB=AB.toLowerCase();
//	   BA=BA.toLowerCase();
//	  boolean f = false;
//	  char[] c = AB.toCharArray();
//	  Arrays.sort(c);
//	  char[] d = BA.toCharArray();
//	  Arrays.sort(d);
//	  String a = new String (c);
//      String b = new String (d);
//      if (a.equals(b)) {
//    	  f=true;
//      }
//      return f;
//   
//   }
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        boolean ret=isAnagram(A,B);
//
//        System.out.println(ret);  
//        
//    }
//}

                                           //Program6: String Splitting

//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       
//        if (!sc.hasNext()){
//            System.out.println(0);
//        }else {
//             String input=sc.nextLine();
//            String[]a = input.trim().split("[ !,?._'@]+");
//            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
//            System.out.println(listOfStrings.size());
//      
//          for(String str:listOfStrings){
//            System.out.println(str);
//          }    
//        }  
//    }
//}

                                   //Program7.1:TypeCasting(Implicit)

//class Solution{
//	public static void main(String args[]) {
//		int num=10;
//		System.out.println(num);
//		
//		float num2=num;
//		System.out.println(num2);
//	}
//}

                                  //Program7.2:(Explicit)

//class Solution{
//	public static void main(String args[]) {
//		 
//		float num1=10.99f;
//		System.out.println(num1);
//		  int num2=(int)num1;
//		  System.out.println(num2);
//	}
//}

                                 //Program 8:Ternary Operator

//class Solution{
//	public static void main(String args[]) {
//		
//		int x,y;
//		x=10;
//		y=x==10?20:40;
//		
//		System.out.println(y);
//		
//	}
//}
  
                               //Program 9.1: Conditional(if-else Statement)

//class Solution{
//	public static void main(String[] args) {
//		
//		Scanner scan=new Scanner(System.in);
//		int x=scan.nextInt();
//		int y=scan.nextInt();
//		
//		
//		if(x>y) {
//			System.out.print("X is Greater.");
//		}
//		else {
//			System.out.print("Y is greater.");
//		}
//	}
//}
 
                             //Program 9.2: Switch Statement


//class Solution{
//	public static void main(String[] args) {
//		
//		Scanner scan=new Scanner(System.in);
//		int day=scan.nextInt();
//		
//		switch(day) {
//		
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Unknown Number");
//		
//		}
//	}
//}

                                    //Program 10:While Looping

//class Solution{
//	public static void main(String args[]) {
//		
//		int i=100;
//		while(i>=1) {
//			System.out.println(i);
//			i=i-1;
//		}	
//	}
//}

                                    //Program 11:Do-While Looping

//class Solution{
//	
//	public static void main(String args[]) {
//		
//		int i=10;
//		
//		do {
//			
//			System.out.println(i);    //code to be executed
//			i--;                      //update statement
//			
//		}
//		while(i>=1);
//	}
//}


                                  //Program 12: Break and Continue

//class Solution{
//	public static void main(String [] args) {
//		 
//		int n=7;
//		
//		for(int i=0;i<=n;i++) {
//			if(i==3) {
//				continue;                       //Break /Continue Statement
//			}
//			System.out.println(i);
//		}
//	}
//}

            // Note- Break: Break the iteration/loops.
              //  Continue: Skip the current iteration.


                                  //Program 13: Parametrized Constructor 

//public  class Solution{
//	
//	String name;
//	int age;
//	
//	Solution(String value1,int value2){
//		
//		this.name=value1;
//		this.age=value2;
//		
//	}
//	 void display() {
//		 System.out.println(name+ " " + age);
//	 }
//	public static void main(String args[]) {
//		
//		Solution obj= new Solution("abhishek", 24);
//		obj.display();
//		
//	}
//}

                               //Program 14: Getter and Setter

//class Solution{
//	
//	private String name;
//	
//	public String getname() {
//		return name;
//	}
//	
//	public void setname(String val) {
//		 this.name=val;
//	}
//	
//	public static void main(String[] args) {
//		
//		Solution obj=new Solution();
//		obj.setname("This is Abhishek");
//		System.out.println(obj.getname());
//	}
//}

                            //Program 15:Static Keyword

//class Student {
//    int rollno; // Instance variable
//    String name;
//    static String college = "Amrita"; // Static variable
//
//    // Constructor
//    Student(int r, String n) {
//        rollno = r;
//        name = n;
//    }
//
//    // Method to display the values
//    void display() {
//        System.out.println(rollno + " " + name + " " + college);
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter roll number: ");
//        int rollNo1 = scanner.nextInt();
//        System.out.print("Enter name: ");
//        String name1 = scanner.next();
//
//        Student s1 = new Student(rollNo1, name1);
//    
//        // We can change the college of all objects by the single line of code
//        // Student.college = "BBDIT";
//
//        s1.display();
//    }
//}

                             //Program 16:



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
//import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hashed PIN: ");
        String hashedPin = scanner.nextLine();

        // Create a MessageDigest object for MD5
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Loop through all possible combinations of 4-digit PINs
        for (int i = 0; i < 10000; i++) {
            String pin = String.format("%04d", i);

            // Calculate the MD5 hash of the PIN
            byte[] bytes = md.digest(pin.getBytes());
            String hash = bytesToHex(bytes);

            // If the hash matches the hashed PIN, then print the PIN
            if (hash.equals(hashedPin)) {
                System.out.println("The PIN is: " + pin);
                break;
            }
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(String.format("%02x", bytes[i]));
        }
        return sb.toString();
    }
}







 