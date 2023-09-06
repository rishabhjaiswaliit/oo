class Vector {
  private int x;
  private int y;
  public Vector() {
     
  }
  public Vector(int x, int y) {
    if (x < 0) {
      System.out.println("Invalid x");
    } else {
      this.x = x;
    }
    if (y < 0) {
      System.out.println("Invalid y");
    } else {
      this.y = y;
    }
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  // some real world applications setPassword() { some conditions }
  public void setX(int x) {
    if (x < 0) {
      System.out.println("Invalid");
    } else {
      this.x = x;
    }
  }
  // exact same logic INTERAHCANGEABLE PATTERN
  public void setY(int y) {
    if (y < 0) {
      System.out.println("Invalid");
      return;
    }
    this.y = y; 
  }
  
  // public void addToVector(Vector otherVector) {
  //   this.x += otherVector.x;
  //   this.y += otherVector.y;
  // }
  public Vector add(Vector other) {
    int newX = this.getX() + other.getX();
    int newY = this.getY() + other.getY();
    return new Vector(newX, newY); 

  }
  public static Vector add(Vector v1, Vector v2) {
    int newX = v1.getX() + v2.getX();
    int newY = v1.getY() + v2.getY();
    return new Vector(newX, newY); 
  }
  
}


public class YourClassNameHere {
    public static void main(String[] args) {
      Vector v1 = new Vector(10, 20); // set initial values       
      Vector v2 = new Vector(100, 200);
      // v1.addVector(v2); // mutation(changing values) is usually not preferred
      // v2.addVector(v1);
      
      // Class.function() // static way
      Vector v3 = Vector.add(v1, v2); // 110, 220 // static way of doing same thing
      // // obj.function() // non-static way
      Vector v4 = v1.add(v2); // 110, 220 non-static way of doing same thing
      Vector v5 = v2.add(v1); // 110, 220
      
      if (v3 == v4) {
        System.out.println("v3 v4 same"); 
      } else {
        System.out.println("v3 v4 different");
      }      
      
      if (v4 == v5) {
        System.out.println("v4 v5 same"); 
      } else {
        System.out.println("v4 v5 different");
      }
      
      if (v3.getX() == v4.getX() && v3.getY() == v4.getY()) {
        System.out.println("v3 v4 same"); 
      } else {
        System.out.println("v3 v4 different");
      }   
      // Vector v30 = v3;

      // if (v30 == v3) {
      //   System.out.println("v3 v30 are the same"); 
      // } else {
      //   System.out.println("v3 v30 are different");
      // }
    }
}
