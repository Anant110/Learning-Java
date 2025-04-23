package Core_Java_Concepts.OOP_in_Java.setter_getter_methods;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Lamborghini","MIN789",4);

        //By using set methods we can update the car properties
        car.setName("Marti");
        car.setModal("KI9876");
        car.setWheels(9);


        //Can access by using the get method
        System.out.println(car.getName()+" "+car.getModal()+" "+car.getwheels());
    }
}
