package Core_Java_Concepts.Java_Basics;

import java.util.Scanner;

public class Nested_loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Enter the rows
        System.out.print("Number of Rows: ");
        int row=scanner.nextInt();

        //Enter the columns
        System.out.print("Enter the Columns: ");
        int col=scanner.nextInt();

        //Enter the symbol
        System.out.print("Enter the symbol to you use: ");
        char symbol=scanner.next().charAt(0); //To intialize the character

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}
