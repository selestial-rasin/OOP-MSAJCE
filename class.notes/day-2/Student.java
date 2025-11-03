class Student {
  int age = 20;
  String name = "Ravi";

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class Basics {
  public static void main(String[] args) {
    Student s1 = new Student();  // object creation
    s1.display();                // calling method using object
  }
}
