package Core_Java_Concepts.OOP_in_Java.Basics.Constructors;

public class Account {
    private int account_no;
    private String name;
    private double balance;

    public Account(){
        System.out.println("I am a default constructor");
        account_no=7487384;
        name="Prathma Bank";
        balance=9867484.23;
    }
    public Account(int acc,String n,double b){
        account_no=acc;
        name=n;
        balance=b;
    }

    public void show(){
        System.out.println("Account Number: "+account_no);
        System.out.println("Bank Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
