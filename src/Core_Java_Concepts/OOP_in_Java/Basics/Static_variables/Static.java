package Core_Java_Concepts.OOP_in_Java.Basics.Static_variables;

class Demo{
    int a;
    static int b;
}

public class Static {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.a=90;
        d2.a=97;
        d3.a=76;
        System.out.println();
        //if we assigned the value of static variable it ise recommended to use class demo to assign the value
        //because static variables is not the part of object it is a part of class
        Demo.b=65;
        Demo.b=63;
        Demo.b=45;

    }
}

