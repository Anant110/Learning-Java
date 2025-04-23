package Core_Java_Concepts.OOP_in_Java.Basics.Constructor_chaining;

public class useBox {
    public static void main(String[] args) {
        Box b1=new Box(12,89,45);
        Box b2=new Box(90);
        Box b3=new Box();
        b1.show();
        System.out.println();
        b2.show();
        System.out.println();
        b3.show();
    }
}
