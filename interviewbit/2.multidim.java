import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();
                
        for (int j = 0; j < m; j++) {
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += mat[i][j];
            }
            System.out.print(total + " ");
        }
                
    }
}


// METHOD 2
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] arr = input.trim().split(" ");
            for (int j = 0; j < arr.length; j++) {
                mat[i][j] = new Integer(arr[j]);
            }
        }
                
        for (int j = 0; j < m; j++) {
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += mat[i][j];
            }
            System.out.print(total + " ");
        }
                
    }
}
