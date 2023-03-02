



class Person {
  //Field 
  private String name;
  private int age;
  private int height;
  private int weight;

  //Constructor
  public Person(){}
  public Person(String name, int age, int height, int weight){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  //Method
  public String getName() {return name;}
  public void setName(String name) {this.name = name;}

  public int getAge(){return age;}
  public void setAge(int age){this.age = age;}

  public int getHeight(){return height;}
  public void setHeight(int height){this.height = height;}

  public int getWeight(){return weight;}
  public void setWeight(int weight){this.weight = weight;}

  public void move(){
    System.out.println("이동중...");
  }
}

class Villain extends Person{
  //Field
  private String unique_key;
  private int weapon;
  private double power;
  //Consteructor
  public Villain(){}
  public Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power){
    super(name, age, height, weight);
    this.unique_key = unique_key;
    this.weapon = weapon;
    this.power = power;  
  }

  //Method
  public String getUniqueKey(){return unique_key;}
  public void setUniqueKey(String unique_key){this.unique_key = unique_key;}

  public int getWeapon(){return weapon;}
  public void setWeapon(int weapon){this.weapon = weapon;}

  public double getPower(){return power;}
  public void setPower(double power){this.power = power;}

  public void printPerson(){
    System.out.println("------------------------");
    System.out.println("악당 이름 : "+getName());
    System.out.println("악당 나이 : "+getAge());
    System.out.println("악당의 키 : "+getHeight());
    System.out.println("악당 체중 : "+getWeight());
    System.out.println("악당 넘버 : "+getUniqueKey());
    System.out.println("악당 무기 : "+getWeapon());
    System.out.println("악당 파워 : "+getPower());
    System.out.println("------------------------");
  }

}

class Hero extends Person {

}

public class GettrSetter {
  public static void main(String[] args) {
    //[1]:객체 생성
    Villain v1 = new Villain("좀비",20,180,80,"15001231",1,99.5);
    v1.printPerson();
  }
}



