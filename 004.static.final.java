public class YourClassNameHere {
    public static void main(String[] args) {
      // final: constant
      // static:can be called with/without creating a class
      //  static variables: values would be common to all objects of the class
      Vector v1 = new Vector();
      v1.x = 100;
      Vector v2 = new Vector();
      
      System.out.println(v2.x);
      System.out.println(v2.count);
    }
}

class Vector {
  int x; 
  int y;
  static int count;
  Vector() {
    count += 1;  
  }
}
