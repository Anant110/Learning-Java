package Core_Java_Concepts.OOP_in_Java.Inheritance;

public class Doctor {
    public void doctor(){
        System.out.println("I am Parent Doctor");
    }
}

class Surgeon extends Doctor{
    public void surgeon(){
        System.out.println("I am a sub class surgeon");
    }
}

