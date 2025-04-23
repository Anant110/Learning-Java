package Core_Java_Concepts.OOP_in_Java.Aggregation;

public class Main {
    //Aggregation: It represent the "has-a" relationship between the objects
    //One object contains another object as a part of the structure
    //but the contained objects can exists independently

    public static void main(String[] args) {
        Book book1=new Book("Holy Leader",890);
        Book book2=new Book("Place and Leader",876);
        Book book3=new Book("MonaLisa",987);

        Book[] books={book1,book2,book3};

//        for(Book book:books){
//            book.display();
//        }

        Library library=new Library("Mircasa",1980,books);
        library.show();
    }
}
