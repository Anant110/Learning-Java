package Core_Java_Concepts.OOP_in_Java.Basics.Static_variables;

class useMymath{
    public static int add(int a,int b) {
        return a + b;
    }
}

public class Mymath {
    public static void main(String[] args) {
        System.out.println("SUM IS "+useMymath.add(12,90));
    }
}
