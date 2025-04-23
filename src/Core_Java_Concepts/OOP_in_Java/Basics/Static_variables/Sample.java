package Core_Java_Concepts.OOP_in_Java.Basics.Static_variables;

class Add{
    static int a=90;
    int b=76;
}

public class Sample {
    public static void main(String[] args) {
        System.out.println("A value is "+Add.a); //we can directly access the static member in main function
//        System.out.println("B is"+Add.b); //we can access non static variable without making the object

        Add newk=new Add();
        System.out.println("B is "+newk.b); //we can access b be making the object of that class
    }
}
