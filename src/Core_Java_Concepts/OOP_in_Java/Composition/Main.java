package Core_Java_Concepts.OOP_in_Java.Composition;

public class Main {
    //Composition: represents the "part-off" relationship between objects
    //for example an engine is the part of car
    //Allows complex objects to e constructed from smaller objects

    public static void main(String[] args) {
        Car car=new Car("Lambourgini",9876,"V98");
        car.show();
    }
}
