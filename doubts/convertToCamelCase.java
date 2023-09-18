// CONVERT FROM camelCase to 
public class YourClassNameHere {
    public static void main(String[] args) {
      String input = "use my account";
      String[] arr = input.split(" ");
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < arr.length; i++) {
        String word = arr[i];
        if (i == 0) {
          sb.append(word.toLowerCase());
        } else {
          sb.append((word.charAt(0) + "").toUpperCase() + word.substring(1).toLowerCase());
        }
      }
      System.out.println(sb.toString());
    }
}

// # arr = []
// # for c in "aeiou":
// #     arr.append(c.upper())
// # print(''.join(arr))

// s = ""
// for i, word in enumerate("use my account".split(' ')):
//     if i == 0:
//         s = s + word
//     else:
//         s = s + word[0].upper() + word[1:]
// print(s)
