public class Main {
    public static void main(String[] args) {
        try {
            Vector v1 = new Vector(10, 20, 200);
            Vector v2 = v1.clone();
            v2.a.z = 25;
            System.out.println(v1.a.z);
        } catch (CloneNotSupportedException e) {
            System.out.println("dd");
        }
    }

}
class Vector implements Cloneable {
    int x;
    int y;
    Animal a;
    public Vector(int x, int y, int z) {
        System.out.println("constructor HERE");
        this.x = x;
        this.y = y;
        this.a = new Animal(z);
    }
    public Vector() {}
    public Vector clone() throws CloneNotSupportedException {
      Vector newVector = (Vector) super.clone();
      newVector.a = new Animal(this.a.z);
      return newVector;
    }
}

class Animal {
  int z;
  Animal(int z) {
    this.z = z;
  }   
}
