package pkg;


class Person {
  // [1]:속성(Attribute)
  int age;
  String name;

  // [2]:생성자(Constructer)
  public Person(){

  }

  // [3]:메서드(Method)
  public void move(){
    System.out.println("Person은 움직인다");
  }
}

public class Main02 {
  public static void main(String[] args) {
    new Person();
  }
  
}
