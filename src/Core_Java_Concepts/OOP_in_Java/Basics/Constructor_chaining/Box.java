package Core_Java_Concepts.OOP_in_Java.Basics.Constructor_chaining;

public class Box {
    private int height,width,length;
    Box(int height,int width,int length){
        this.height=height;
        this.width=width;
        this.length=length;
    }

    Box(int side){
//        length=side;
//        width=side;
//        height=side;

        //constructor chaining
        this(side,side,side); //Always be the first statement of any constructor otherwise shows error
    }

    Box(){
//        length=0;
//        width=0;
//        height=0;

        //constructor chaining method call the constructor where the arguments are 3
        this(0,0,0);
    }
    void show(){
        System.out.println("Length is: "+length);
        System.out.println("Width is: "+width);
        System.out.println("Height is: "+height);
    }
}
