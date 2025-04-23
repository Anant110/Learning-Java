package Core_Java_Concepts.Java_Basics;

import java.util.Random;

public class Number {
    public static void main(String[] args) {
        Random random=new Random();

        int number=random.nextInt();//For generate large numbers
        System.out.println(number);

        int num=random.nextInt(1,9);//Numbers generate between 1 and 9
        System.out.println(num);

        double n=random.nextDouble(1,9); //If we want to calculate the numbers between 1 and 9
        System.out.println(n);

        boolean isHeads=random.nextBoolean(); //Either true or false
        System.out.println(isHeads);
        if(isHeads){
            System.out.println("HEADS");
        }
        else System.out.println("TAILS");
    }
}
