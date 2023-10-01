import java.io.*;
import java.util.*;

public class StaticInitializer {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int b=sc.nextInt();
            int h=sc.nextInt();
        
           int area=b*h;
           System.out.println(area);
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
     
    }
}