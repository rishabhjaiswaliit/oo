import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                
        int numStr = sc.nextInt();
        while (numStr-- > 0) { System.out.println(checkBal(sc.next()) ? 1 : 0); }      
        sc.close();
    }
               
    public static boolean checkBal(String str) {
        Stack<Character> stk = new Stack<>();                  
        for (int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);          
            if (ch == '(') { stk.push(ch); }
            else if (ch == ')' && !stk.empty() && stk.peek() == '(') { stk.pop(); }
            else { return false; }          
        }
        return stk.empty();  
    }
}
