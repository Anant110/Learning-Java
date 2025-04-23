package Core_Java_Concepts.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Exception: An event that interrupts the normal flow of code
                 // Dividing by zero, file not found, mismatch input type
                 // Surrounded and dangerous block with a try{} block
                 // try{} catch{} finally{}
    public static void main(String[] args) {
//        try{
//            System.out.println(1/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("CAN'T BE DIVIDE BY ZERO");
//        }
        Scanner scanner=new Scanner(System.in);

        try {
            System.out.print("Enter any number: ");
            int num=scanner.nextInt();
            System.out.println(num);
        }
        catch (ArithmeticException e){
            System.out.println("CAN'T BE DIVIDE BY ZERO");
        }
        catch (InputMismatchException e){
            System.out.println("INVALID NUMBER!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
            System.out.println("final block is always executes");
        }
    }

}
