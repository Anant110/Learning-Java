package Core_Java_Concepts.staticExample;

public class Friend {
    String name;
    static int numOfFriends;

    Friend(String name){
        this.name=name;
        numOfFriends++;
    }

    static void show(){ //if we access static method then function should also be static
        System.out.println("You have the total of "+numOfFriends+" friends");
    }
}
