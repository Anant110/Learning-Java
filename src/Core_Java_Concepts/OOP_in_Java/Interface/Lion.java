package Core_Java_Concepts.OOP_in_Java.Interface;

public class Lion implements Animal{

    @Override
    public void makesound() {
        System.out.println("Loin Sounds");
    }

    @Override
    public void eat() {
        System.out.println("Loin Eats");
    }
}
