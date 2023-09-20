import java.util.*;
public class Main {
  public static void main(String[] args) {
      Integer[] arr = {9, 8, -1, 7};
      Arrays.sort(arr, (a, b) -> b - a);
      
      String[] strings = {"z", "aa", "bbb"};
      // Arrays.sort(strings, (a, b) -> new Integer(b) - new Integer(a));
      // Arrays.sort(strings, (a,b) -> b.compareTo(a));      
      Arrays.sort(strings, (a, b) -> b.length() - a.length());
  }
}
