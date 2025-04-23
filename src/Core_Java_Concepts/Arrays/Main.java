package Core_Java_Concepts.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String[] fruits={"Apple","Banana","Orange","Papaya","Guava"};

        fruits[0]="Chiku"; //arrays is mutable can be change

//        System.out.println();
        System.out.println(fruits.length); //calculate length

        //To sort Array
        Arrays.sort(fruits);

        //fill method-->to fill array with same values
        Arrays.fill(fruits,"Mango");

        for(String val:fruits){ //print values of array
            System.out.print(val+" ");
        }


        //this give the error to show that array is out of bounds
//        String[] fruits={};
//        fruits[0]="Apple";
//        System.out.println(fruits.length);

        String[] fruits=new String[3];

//        fruits[0]="Apple";
//        fruits[1]="Mango";
//        fruits[2]="Guava";

        //To declare the user input for array
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i< fruits.length;i++){
            System.out.print("Enter the fruit: ");
            fruits[i]=scanner.nextLine();
        }

        for(String fruit:fruits){
            System.out.print(fruit+" ");
        }
         */
        //To declare the size of array from user input
        Scanner scanner=new Scanner(System.in);
        int[] num;
        System.out.println("Enter the size of Array");
        int size=scanner.nextInt();
        num=new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter the %d value: ",i+1);
            num[i]=scanner.nextInt();
        }

        for(int n:num){
            System.out.print(n+" ");
        }

    }
}
