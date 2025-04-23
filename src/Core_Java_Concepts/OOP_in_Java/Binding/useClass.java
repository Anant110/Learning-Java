package Core_Java_Concepts.OOP_in_Java.Binding;

public class useClass {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.show(); //checks reference Parent because of static
        p.display(); //checks object due to non static

        p=new Child();
        p.show(); //shows early binding because the reference is same as parent also called Method hiding
        p.display(); //shows late binding due to changing of object
    }
}
