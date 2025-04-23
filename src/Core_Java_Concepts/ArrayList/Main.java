package Core_Java_Concepts.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //ArrayList: It is a resizeable array that stores objects
    //Arrays are fixed in size but ArrayList is dynamic
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Coconut");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");


        //Remove method
        fruits.remove("Apple");

        //Set method
        fruits.set(0,"Apple"); //replace coconut with apple

        //Get method
        System.out.println(fruits.get(1));

        //Size method
        System.out.println(fruits.size());
        
        //Sort method
        Collections.sort(fruits);
        System.out.println(fruits);

        //User input
        ArrayList<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int num=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num;i++){
            System.out.printf("Enter the fruit # %d :", i+1);
            String fruit=scanner.nextLine();
            list.add(fruit);
        }

        System.out.println(list);
        scanner.close();
    }
}
