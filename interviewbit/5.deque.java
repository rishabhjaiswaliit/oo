import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Deque<Integer> q = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x == 1) {
                q.addLast(y);
            } else if (x == 2) {
                q.addFirst(y);
            } else if (x == 3) {
                Integer peekedVal = q.peekFirst();
                System.out.println(peekedVal != null ? peekedVal: -1);
            } else if (x == 4) {
                Integer peekedVal = q.peekLast();
                System.out.println(peekedVal != null ? peekedVal: -1);
            } else if (x == 5 && !q.isEmpty()) {
                q.removeFirst();
            } else if (x == 6 && !q.isEmpty()) {
                q.removeLast();
            }
        }

    }
}
