package Core_Java_Concepts.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your name:");

        //For string
//        String name=scanner.nextLine();//if you want spaces
//        System.out.println(name);

//        System.out.println("Enter your first name:");
//        String small=scanner.next(); //if you don't want spaces
//        System.out.println(small);

        //to declare integer

//        System.out.println("Enter age: ");
//        int age=scanner.nextInt(); //Integer
//        System.out.println("Age is: "+age)

        //to declare double
//        System.out.print("Enter GPA: ");
//        double gpa=scanner.nextDouble();
//        System.out.println(gpa);

        //to declare Boolean
//        System.out.println("Are you a student");
//        boolean istrue=scanner.nextBoolean();
//        System.out.println("Student: "+istrue);

        //To declare a character
        System.out.println("Enter any character you want: ");
        char num=scanner.next().charAt(0);
        System.out.println(num);


        scanner.close();


    }
}
