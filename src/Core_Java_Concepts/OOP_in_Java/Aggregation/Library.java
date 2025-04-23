package Core_Java_Concepts.OOP_in_Java.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void show(){
        System.out.println(this.name+" "+this.year);
        System.out.println("Number of available books are: ");
        for(Book book:books){
            book.display();
        }
    }
}
