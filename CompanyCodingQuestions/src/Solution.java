import java.util.*;
  
                                 //AMERICAN EXPRESS
                                 //Task 1 Program

//class Solution {
//public static String solution(int M, int L, int[] C) {
//int length = C.length;
//int[] row1 = new int[length];
//int[] row2 = new int[length];
//int count = 0;
//for (int i = 0; i < length; i++) {
//if (C[i] == 2) {
//row1[i] = 1;
//row2[i] = 1;
//M--;
//L--;
//} else if (C[i] == 1) {
//count++;
//}
//}
//if (M < 0 || L < 0 || count != M + L) return "IMPOSSIBLE";
//int index = 0;
//while (M + L > 0) {
//while (M > 0) {
//if (C[index] == 1) {
//row1[index] = 1;
//M--;
//}
//index++;
//}
//while (L > 0) {
//if (C[index] == 1) {
//row2[index] = 1;
//L--;
//}
//index++;
//}
//}
//String res1 = "";
//for (int i : row1) {
//res1 += i;
//}
//res1 += ",";
//for (int i : row2) {
//res1 += i;
//}
//return res1;
//}
//}



                                       //Task 2 Program

//public class Solution {
//	   public int solution(int[] A) {
//	       int N = A.length;
//	       int minCost = Integer.MAX_VALUE;
//
//	       for (int P = 1; P < N - 1; P++) {
//	           for (int Q = P + 2; Q < N; Q++) {
//	               int cost = A[P] + A[Q];
//	               if (cost < minCost) {
//	                   minCost = cost;
//	               }
//	           }
//	       }
//
//	       return minCost;
//	   }
//	}


                                   //Task 3 Program

//int sum;
//tree *l;   //iThat 2 lines i have added(C++ me Code kiya tha)
//tree *r;
//int solution(tree *T) {
//if (T == NULL) {
//  return 0;
//}
//sum = 0;
//sum += solution(T->l);
//sum += solution(T->r);
//return sum + T->x;
//}