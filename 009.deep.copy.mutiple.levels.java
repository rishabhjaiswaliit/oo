public class Main {
    public static void main(String[] args) {
            Vector v1 = new Vector(10, 20);
            v1.a.h = new Head("Barks");
            Vector v2 = v1.clone();
            System.out.println(v2);
    }

}
class Vector implements Cloneable {
    int x;
    int y;
    Animal a;
    public Vector(int x, int y) {
        System.out.println("constructor HERE");
        this.x = x;
        this.y = y;
        this.a = new Animal();
    }
    public Vector() {}
    public Vector clone() {
      Vector newVector = new Vector(this.x, this.y);
      Head h = new Head(this.a.h.sound);
      newVector.a = new Animal(h);
      return newVector;
    }
}

class Animal {
  Head h;
  Animal(Head h) {
    this.h = h;
  }
  Animal() {
  }
}
class Head {
  String sound;
  Head(String sound) {
    this.sound = sound;
  }
  Head() {
  }
}
