public class YourClassNameHere {
    public static void main(String[] args) {
      GrandParent ch = new Child();
      System.out.println(ch.commonVar);
      System.out.println(((Parent)ch).commonVar);
      System.out.println(((Child)ch).commonVar);
    
      ch.commonFun();
      ((Parent)ch).commonFun();
      ((Child)ch).commonFun();
    }
}

class GrandParent {
  int commonVar = 50;
  void commonFun() {
    System.out.println("G");
  }
}

class Parent extends GrandParent {
  int a;
  int b;
  void commonFun() {
    System.out.println("P");
  }
}

class Child extends Parent {
  int c;
  int commonVar = 200;
  
  void commonFun() {
    System.out.println("C");  
  }
}
