import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> rList = new ArrayList<>();
        List<Shape> sList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            Rectangle rect = new Rectangle(length, breadth);
            rList.add(rect);
        }
        for (int i = 0; i < 2; i++) {
            double side = sc.nextDouble();
            Square sq = new Square(side);
            sList.add(sq);
        }
        double overallMaxArea = Math.max(findMaxArea(rList), findMaxArea(sList));
        System.out.println("Max Area: " + overallMaxArea);
    }
    static double findMaxArea(List<Shape> list) {
        double maxAreaSoFar = 0;
        for (Shape shape: list) {
            maxAreaSoFar = Math.max(maxAreaSoFar, shape.area());
        }
        return maxAreaSoFar;
    }
}

abstract class Shape {
    public abstract double area();
}

class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    public double area() {
        return this.side * this.side;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return this.length * this.breadth;
    }
}
