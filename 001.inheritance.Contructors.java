public class YourClassNameHere {
    public static void main(String[] args) {
      Child c = new Child();
    }
}

class Parent {
  int a;
  int b;
  Parent() {
    this(10);
    System.out.println("2");
  }
  Parent(int a) {
    System.out.println("1");
  }
}

class Child extends Parent {
  int c;
  Child()  {
    this(10);
    System.out.println("5");
    
  }
  Child(int c) {
    this(10, 10, 10);
    System.out.println("4");
  }
  Child(int a, int b, int c) {
    super(); // either this() OR super() should be the FIRST LINE in JAVA
    System.out.println("3");
  }
}
