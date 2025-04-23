package Core_Java_Concepts.OOP_in_Java.Super;

public class Student extends Person{
    int marks;

    Student(String name,String color,int marks){
        super(name,color);
        this.marks=marks;
    }

    void show(){
        System.out.println("Name is: "+this.name+" marks is "+this.marks);
    }
}
