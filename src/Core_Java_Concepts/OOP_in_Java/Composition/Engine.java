package Core_Java_Concepts.OOP_in_Java.Composition;

public class Engine {

    String engineType;
    Engine(String engineType){
        this.engineType=engineType;
    }

    void engineDetails(){
        System.out.println("Engine Details is: "+this.engineType);
    }
}
