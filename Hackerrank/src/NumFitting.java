import java.util.*;

public class NumFitting {

   static String fitcheck(String newstring)
   {
	 String answer= "";
     try{
          long num=Long.parseLong(newstring);
          answer=newstring + "can be fitted in:\n";
          if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
        	  answer=answer.concat("*byte\n  *short\n  *int\n  *long");
          }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
              answer = answer.concat("* short\n* int\n* long");
          }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                  answer = answer.concat("* int\n* long");
          }else{
                  answer = answer.concat("* long");
          }
        	
        }
     catch(NumberFormatException e){
    	 answer=newstring + "can't be fitted anywhere";
     }
	return answer;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++) {
	
    	String newstring=sc.nextLine();
    	System.out.println(fitcheck(newstring));
   }
  }
}