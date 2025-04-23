package Core_Java_Concepts.OOP_in_Java.Runtime_polymorphism;

import java.util.Scanner;

public class useLanguage {
    public static void main(String[] args) {
        Language l;
//        l=new Language(); //shows error because we can make the object of abstract class
//        l.lang();
        //Runtime polymorphism: when the method that gets executed is decided at run time based on the actual
        //type of the object
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter you choice which language you choose:");
        System.out.println("""
                1. English
                2. French
                3. Hindi
                """);
        System.out.print("Enter Number: ");
        int choice= scanner.nextInt();

        if(choice==1){
            l=new English();
            l.lang();
        }
        else if(choice==2){
            l=new French();
            l.lang();
        }
        else if(choice==3){
            l=new Hindi();
            l.lang();
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
