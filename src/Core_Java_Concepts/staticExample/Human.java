package Core_Java_Concepts.staticExample;

public class Human {
    String name;
    String gender;
    int age;
    boolean married;
    static long population; //static variable is same to all objects not a part of only single object

    static void message(){
        System.out.println("Hello everyone");
//      System.out.println(this.name); //It is part of object so can't access inside the static method which is depend upon class not object
    }
    Human(String name,String gender,int age,boolean married){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.married=married;
        Human.population+=1; //can be access either Human or this keyword
    }
}
