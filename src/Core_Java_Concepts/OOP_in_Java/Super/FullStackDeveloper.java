package Core_Java_Concepts.OOP_in_Java.Super;

public class FullStackDeveloper extends FrontEndDeveloper {
    void myskills(){
        super.myskills(); //calls parent class explicitly using super keyword
        System.out.println("As well as I am also good at Node, MongoDB,Express");
    }
}
