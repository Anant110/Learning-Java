package Core_Java_Concepts.overloaded_methods;

public class Main {
    public static void main(String[] args) {
        add(8.90,7.65);
        add(8,9);
    }
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
}
