package Core_Java_Concepts.OOP_in_Java.setter_getter_methods;

public class Car {
    //setter and getter: they help to protect data and add rules for accessing and modifying
    //GETTERS: methods that make the field readable
    //SETTERS: methods that make the field writeable

    private String name;
    private String modal;
    private int wheels;

    Car(String name,String modal,int wheels){
        this.name=name;
        this.modal=modal;
        this.wheels=wheels;
    }

    String getName(){
        return this.name;
    }

    String getModal(){
        return this.modal;
    }

    int getwheels(){
        return this.wheels;
    }

    void setName(String name){
        this.name=name;
    }

    void setModal(String modal){
        this.modal=modal;
    }

    void setWheels(int wheels){
        this.wheels=wheels;
    }

}
