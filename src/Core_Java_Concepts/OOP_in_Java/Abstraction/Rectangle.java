package Core_Java_Concepts.OOP_in_Java.Abstraction;

public class Rectangle extends Area{
    double width;
    double length;

    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    @Override
    double area(){
        return length*width;
    }
}
