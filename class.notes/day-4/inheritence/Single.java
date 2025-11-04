class A {
  void displayA() {
    System.out.println("Class A method");
  }
}

class B extends A {
  void displayB() {
    System.out.println("Class B method");
  }
}

public class Single {
  public static void main(String[] args) {
    B obj = new B();
    obj.displayA();
    obj.displayB();
  }
}
