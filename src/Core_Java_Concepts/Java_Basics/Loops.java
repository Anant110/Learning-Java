package Core_Java_Concepts.Java_Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many second you choose for countdown");
        int start=scanner.nextInt();
        for(int i=start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
    }
}
