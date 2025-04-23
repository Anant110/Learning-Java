package Core_Java_Concepts.OOP_in_Java.Aggregation;

public class Book {
    String name;
    int pages;

    Book(String name,int pages){
        this.name=name;
        this.pages=pages;
    }

    void display(){
        System.out.println(this.name+" "+this.pages);
    }

}
