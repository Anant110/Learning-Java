package Core_Java_Concepts.OOP_in_Java.encapsulation;

public class Student {
    private int roll_no;
    private String name;
    private int age;

    public void setStudent(int r,String n,int a){
        if(r<=0){
            System.out.println("Roll no. must be positive");
            roll_no=r;
        }
        else {
            roll_no=r;
        }
        name=n;
        age=a;
    }

    public void show(){
        System.out.println("Roll No: "+roll_no);
        System.out.println("Name: "+name);
        System.out.println(("Age: "+age));
    }
}

