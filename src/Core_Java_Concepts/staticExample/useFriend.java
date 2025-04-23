package Core_Java_Concepts.staticExample;

public class useFriend {
    public static void main(String[] args) {
        Friend friend=new Friend("Abhishek");
//        friend.show();
        Friend friend1=new Friend("Rahul");
        Friend friend2=new Friend("Vishnoi");

        //if variable is static it must be access by using the
        // class variable beacuse it is easy for the programmer to know about static variable
//        System.out.println(Friend.numOfFriends);
//        System.out.println(Friend.numOfFriends);

        Friend.show();
    }
}
