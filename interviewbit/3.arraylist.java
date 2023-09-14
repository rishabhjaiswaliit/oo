import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        List<Integer> lt = new ArrayList<>();
        int num = sc.nextInt();
        while (num >= 0) {
            lt.add(num);
            num = sc.nextInt();
        }
        for (int i = lt.size() - 1; i >= 0; i--) {
            System.out.print(lt.get(i) + " ");
        }
    }
}
