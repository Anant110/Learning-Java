package Core_Java_Concepts.String_methods;


public class Sentence {
    public static void main(String[] args) {
        /*
        String name="Anant Pratap Singh";

        System.out.println("Name is "+name);
        System.out.println(name.charAt(2));

        int ind=name.indexOf('t'); //if not present returns -1
        System.out.println(ind);

        int ind1=name.lastIndexOf("i"); //it is case sensitive if 's' returns -1
        System.out.println(ind1);

        name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);

        String name1="         Coding        ";
        name1=name1.trim(); //removes the white spaces
        System.out.println(name1);

        name=name.replace("t","f"); //replace old word to new word
        System.out.println(name);

        System.out.println(name.isEmpty()); //returns false if not empty,else true

        String name2="Hello Horai Holi";
        if(name2.contains("Hor")){ //it checks any word or substring or character present is string or not
            System.out.println("Name is complete");
        }
        else System.out.println("Name is not complete");


        String name="Password";
        if(name.equalsIgnoreCase("password")){ //equals is a case sensitive to ignore this use IgnoreCase
            System.out.println("Your name can't be password");
        }
        else System.out.println("Your name is "+name);

         */

        //Substring method
        String name="Anant Pratap Singh";
        String small=name.substring(0,name.indexOf("P"));
        System.out.println(small);
    }

}
