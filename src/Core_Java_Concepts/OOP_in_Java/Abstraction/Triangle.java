package Core_Java_Concepts.OOP_in_Java.Abstraction;

public class Triangle extends Area{

    int base;
    int height;

    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    @Override
    double area(){
        return 0.5*base*height;
    }
}
