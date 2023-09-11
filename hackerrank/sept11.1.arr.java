import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        // n = int(input())
        // a = [] // Non-fixed array in python
        // Non-fixed array in java SAME THING // List<Integer> a = new ArrayList<>();
        
        // Fixed length array of length n
        int[] a = new int[n];
        
        // for i in range(n):
        //     a.append(int(input()))
        // print(i) // 4
        // -------------
        // int I;
        // for (I = 0; I < n; I++) {
        //     System.out.println("INSIDE LOOP  VALUE: " + I);
        // }
        // System.out.println("OUTSIDE LOOP FINAL VALUE: " + I); // 5
        
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        // for e in a:
        //     print(e)
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
