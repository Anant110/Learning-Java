package Core_Java_Concepts.OOP_in_Java.Interface;

public class useAnimal {
    public static void main(String[] args) {
        Animal animal;
        animal=new Elephant();
        animal.makesound();
        animal.eat();

        animal=new Lion();
        animal.makesound();
        animal.eat();
    }
}
