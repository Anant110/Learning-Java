package Core_Java_Concepts.Varargs;

public class Args {
    public static void main(String[] args) {
        /*
        varargs--> it is the method which pack the elements into an array,therefore no need to overload the elements
        we pass most arguments in function as we want
        (...) ellipses
         */
        System.out.println(add(1,76,2,1,4,3));
        System.out.print("Average of the numbers is: ");
        System.out.println(average(12,11,9,8,7,6,5,6));
    }
    public static int add(int... numbers){ //pack elements into array
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }

    //Find average of numbers
    public static double average(double... numbers){
        double sum=0;
        for(double num:numbers){
            sum+=num;
        }

        return sum / numbers.length;
    }



}
