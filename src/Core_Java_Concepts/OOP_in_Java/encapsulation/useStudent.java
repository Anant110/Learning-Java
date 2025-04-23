package Core_Java_Concepts.OOP_in_Java.encapsulation;

public class useStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudent(-9087,"Anant",89);
        s1.show();

        Student s2=new Student();
        s2.setStudent(8765,"Anubhav",67);
        s2.show();
    }
}
