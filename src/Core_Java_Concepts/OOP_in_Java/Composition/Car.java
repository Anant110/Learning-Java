package Core_Java_Concepts.OOP_in_Java.Composition;

public class Car {
    String name;
    int modal;
    Engine engine;

    Car(String name,int modal,String type){
        this.name=name;
        this.modal=modal;
        this.engine=new Engine(type);
    }

    void show(){
        this.engine.engineDetails();
        System.out.println("Name is: "+this.name+" Modal is "+this.modal);
    }
}
