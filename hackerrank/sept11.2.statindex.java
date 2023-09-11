import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int count = 0;
        // startIndex to endIndex (both inclusively)
        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                int total = getSum(a, startIndex, endIndex);

                if (total < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
    static int getSum(int[] a, int startIndex, int endIndex) {
        int total = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            total += a[i]; 
        }
        return total;
    }
}
