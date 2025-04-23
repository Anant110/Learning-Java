package Core_Java_Concepts.Java_Basics;

public class Printf {
    public static void main(String[] args) {
        //+=output a plus
        //,=comma grouping separator
        //(=negative numbers are enclosed in ()
        //space=display a minus if negative,space if positive

        //printf() is the method used to format the output

//        double a=99.10;
//        double b=100.456;
//        double c=-7890.345;
//        System.out.printf("% f\n",a);
//        System.out.printf("% f\n",b);
//        System.out.printf("% f",c);

        //0=zero padding
        //number=right justified padding
        //negative number=left justified padding

        int a=1;
        int b=12;
        int c=123;
        int d=1234;
        System.out.printf("%-3d\n",a);
        System.out.printf("%-3d\n",b);
        System.out.printf("%-3d\n",c);
        System.out.printf("%-3d",d);


    }
}
