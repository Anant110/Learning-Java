package Core_Java_Concepts.Java_Basics;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Area {
    public static void main(String[] args) {
//        System.out.println("Enter the first value");
        Scanner scanner=new Scanner(System.in);
//
//        double first=scanner.nextDouble();
//        System.out.println("Enter the first value");
//        double second=scanner.nextDouble();
//
//        //Area of right angled triangle
//        System.out.println("Area is: "+sqrt((first*first)+(second*second)));

        //Find the volume,area,circumference of circle
        System.out.println("Enter the radius");
        double radius=scanner.nextDouble();
        double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Volume of Circle is "+volume);
        System.out.println("Area of Circle is "+area);
        //using printf
        System.out.printf("Volume is %.3f",volume);
        System.out.printf("\nArea is %.2f",area);






    }
}
