package Core_Java_Concepts.OOP_in_Java.toString;

public class Car {
    String name;
    String style;
    int modal;

    Car(String name,String style,int modal){
        this.name=name;
        this.style=style;
        this.modal=modal;
    }


    @Override
    public String toString() {
        return this.name +" "+this.style+" "+this.modal;
    }
}
