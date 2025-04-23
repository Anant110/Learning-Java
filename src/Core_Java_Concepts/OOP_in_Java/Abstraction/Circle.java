package Core_Java_Concepts.OOP_in_Java.Abstraction;

public class Circle extends Area{

    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
