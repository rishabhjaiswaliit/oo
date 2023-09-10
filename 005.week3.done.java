class Vector {
  private int x;
  private int y;
  public Vector() {
     
  }
  public Vector(int x, int y) {
    this.x = x;
    this.y = y;
  }
  // Error: incompatible types: void cannot be converted to boolean
  // void equals(Vector v) {
  //   System.out.println("INSIDE HERE");
  // }
  
  boolean equals(Vector v) {
    return this.x == v.x && this.y == v.y;
  }
}


public class YourClassNameHere {
    public static void main(String[] args) {
      // if you override .equals ONLY THEN can you change its behaviour otherwise it behaves like normal == 
      Vector v1 = new Vector(100, 200); // set initial values       
      Vector v2 = new Vector(100, 200);
      if (v1.equals(v2)) {
        System.out.println("same"); 
      } else {
        System.out.println("diff"); 
      }
    }
}
