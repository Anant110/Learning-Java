package Core_Java_Concepts.OOP_in_Java.Interface;

public class Elephant implements Animal{

    @Override
    public void makesound() {
        System.out.println("Elephant Sound");
    }

    @Override
    public void eat() {
        System.out.println("Grasses");
    }
}
