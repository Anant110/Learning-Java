package Core_Java_Concepts.Java_Basics;

import java.util.Scanner;

public class Switch_method {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your week day");
        String weekday=scanner.next();

        //Enhanced switch method
        switch (weekday){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> System.out.println("It is a week day");
            case "Saturday","Sunday"-> System.out.println("It is a weekend");
            default -> System.out.println(weekday+" is not a day");
        }
    }
}
