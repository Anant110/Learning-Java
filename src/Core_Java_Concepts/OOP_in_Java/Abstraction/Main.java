package Core_Java_Concepts.OOP_in_Java.Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(12);
        Rectangle rectangle=new Rectangle(12,10);
        Triangle triangle=new Triangle(10,13);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

        circle.display();
        rectangle.display();
        triangle.display();
    }
}
