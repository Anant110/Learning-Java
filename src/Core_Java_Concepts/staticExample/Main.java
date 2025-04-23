package Core_Java_Concepts.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Anant=new Human("Anant","Male",90,true);
//        Human Anubhav=new Human("Anubhav","Male",12,false);
//
////        System.out.println(Anant.population);
////        System.out.println(Anubhav.population);
//
////  we can access the static variables without using the instances of class:Recommended
//        System.out.println(Human.population);
//        System.out.println(Human.population);
       //Not access because static member only access static data
        fun();

    }
    static void fun(){
        Main obj=new Main();
        obj.greeting(); //you can't use this because it requires an instance
        //but the function you are using this doesn't depend upon the object
    }

    //we know something which is non static belongs to the instances
    void greeting(){
        System.out.println("welcome");
    }
}
