package Core_Java_Concepts.OOP_in_Java.Basics.Constructors;

public class useAccount {
    public static void main(String[] args) {
        Account a1=new Account(); //default constructor calls
        a1.show();

        Account a2=new Account(987464,"SBI Moradabad",97549.90); //parameterized constructor calls
        a2.show();

    }
}
