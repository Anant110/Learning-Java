package Core_Java_Concepts.Java_Basics;

public class Method {
    public static void main(String[] args) {
        String name="Anant";
        int age=89;
        show(name,age);
    }
    public static void show(String name,int age){
        System.out.println("Hello How are you!");
        System.out.printf("My name is %s\n",name);
        System.out.printf("I am pursuing B.Tech with the age of %d\n",age);
        System.out.println("I am good to go");
    }
}
