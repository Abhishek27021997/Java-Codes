import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);

            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }

            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int k = scanner.nextInt();

        String result = getSmallestAndLargest(s, k);
        System.out.println(result);

        scanner.close();
    }
}
