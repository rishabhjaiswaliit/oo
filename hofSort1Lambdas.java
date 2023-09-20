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


// from functools import cmp_to_key
// arr = [9, 8, -1, 7]
// arr.sort(key=cmp_to_key(lambda a, b: b - a ))

// strings = ['1', '2', '10']

// strings.sort(key=cmp_to_key(lambda a, b: int(b) - int(a)))
// strings.sort(key=cmp_to_key(lambda a, b: -1 if b < a else (0 if b == a else 1) ))
// strings.sort(key=cmp_to_key(lambda a, b: len(b) - len(a)))

// # shortcuts
// strings.sort(key=lambda a: int(a), reverse=True)
// strings.sort(reverse=True)
// strings.sort(key=lambda a: len(a), reverse=True)
