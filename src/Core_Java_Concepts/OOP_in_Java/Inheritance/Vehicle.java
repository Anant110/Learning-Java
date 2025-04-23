package Core_Java_Concepts.OOP_in_Java.Inheritance;

public class Vehicle extends Car{
    Vehicle(){
        super("4 wheeler"); //parameterized constructor calls by super keyword
        System.out.println("Vehicle class");
    }
}
