class Vector {
  private int x;
  private int y;
  
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y; 
  }
}


public class YourClassNameHere {
    public static void main(String[] args) {
      Vector v = new Vector();
      v.setX(10);
      v.setY(20);
      System.out.println(v.getX()); // v.x
      System.out.println(v.getY()); // v.y 

    }
}
