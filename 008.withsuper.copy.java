public class Main {
    public static void main(String[] args) {
        try {
            Vector v1 = new Vector(10, 20);
            v1.arr[9] = "SOMETHING";
            Vector v2 = v1.clone();
            v2.arr[0] = "new";          
            System.out.println(v1.arr[0]);
        } catch (CloneNotSupportedException e) {
            System.out.println("dd");
        }
    }

}
class Vector implements Cloneable {
    int x;
    int y;
    String[] arr = new String[10];
    public Vector(int x, int y) {
        System.out.println("constructor HERE");
        this.x = x;
        this.y = y;
        this.arr[0] = "old";
    }
    public Vector() {}
    public Vector clone() throws CloneNotSupportedException {
      Vector newVector = (Vector) super.clone();
      newVector.arr = new String[this.arr.length]; // most imp 
      for (int i = 0; i < this.arr.length; i++) {
        newVector.arr[i] = this.arr[i];  
      }
      return newVector;
    }
}
