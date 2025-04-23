package Core_Java_Concepts.OOP_in_Java.toString;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Suzuki","Great",9876);
        Car car2=new Car("Honda","Best",90746);
        Car car3=new Car("Mahindra","Not Good",97474);

        System.out.println(car); //we can access by making toString method in Main file
        System.out.println(car2);
        System.out.println(car3);
    }
}
