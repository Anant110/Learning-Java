package Core_Java_Concepts.OOP_in_Java.Binding;

public class Child extends Parent{
    public static void show(){ //Method hiding
        System.out.println("I am a child class in show function");
    }

    public void display(){ //Method overriding
        System.out.println("I am a child class in display function");
    }
}
