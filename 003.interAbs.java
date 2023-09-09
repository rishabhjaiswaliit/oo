
public class YourClassNameHere {
    public static void main(String[] args) {
      // dynamic method dispatch -> prevent if ladder 
      Shape shape = new Circle(7);
      System.out.println(shape.getArea());
      
      shape = new Rectangle(20, 20);
      System.out.println(shape.getArea());
      
      shape = new Square(30);
      System.out.println(shape.getArea());
    
      System.out.println(Shape.PI);
      System.out.println(Circle.PI);
    }
}
// interface is an abstract class where all its methods are public and abstract
// 

interface Shape {
  static final double PI = 3.14285714286;
  double getArea();  // public abstract double getArea();
}

class Circle implements Shape {
  int r;
  Circle(int r) {
    this.r = r; 
  }
  public double getArea() {
    return this.PI * this.r * this.r;
  }
}

class Rectangle implements Shape {
  int l;
  int b;
  Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }
  public double getArea() {
    return this.l * this.b;
  }
}
class Square extends Rectangle {
  Square(int l) {
    super(l, l);
  }
  public double getArea() {
    return this.l * this.l;
  }
}
