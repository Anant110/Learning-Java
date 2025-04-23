package Core_Java_Concepts.Practice_problems;

public class Car {
    String name;
    int modal;
    Car(String name,int modal){
        this.name=name;
        this.modal=modal;
    }

    void show(){
        System.out.println("Car name is "+this.name+" and modal is "+this.modal);
    }
}
