package Core_Java_Concepts.Number_Guessing;

import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int guess;
        int min=0;
        int max=100;
        int randomnum=random.nextInt(min,max+1);
        int attempts=0;

        do{
            System.out.printf("Enter a guess between %d-%d\n",min,max);
            guess=scanner.nextInt();
            attempts++;
            if(guess>randomnum){
                System.out.println("TOO HIGH! Try Again");
            }
            else if(guess<randomnum){
                System.out.println("TOO LESS! Try Again");
            }
            else{
                System.out.println("CORRECT! THE NUMBER IS "+randomnum);
                System.out.println("NUMBER OF ATTEMPTS IS "+attempts);
            }
        }while (guess!=randomnum);

//        System.out.println("You have won with in "+attempts);
        scanner.close();

    }
}
