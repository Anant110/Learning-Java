package Core_Java_Concepts.Arrays;

import java.util.Scanner;

public class Quiz_game {
    public static void main(String[] args) {
        String[] questions={"Which of the following is a primary key property in a relational database?"
                              ,"What is the output of 5 + 3 * 2 in C++?"
                              ,"Which keyword is used to inherit a class in Java?",
                               "In which memory are local variables stored?",
                               "What does JVM stand for?"};

        String[][] options={{"A) Can have null values", "B) Must be unique" , "C) Can have duplicates"},
                            {"A) 16" , "B) 11" , "C) 13"},
                            {"A) implements" , "B) extends" , "C) inherits"},
                            {"A) Stack" , "B) Heap" , "C) Static"},
                            {"A) Java Virtual Machine" , "B) Java Verified Mode" , "C) Java Variable Memory"}};

        char[] correct={'B','B','B','A','A'};

        System.out.println("**************");
        System.out.println("QUIZ GAME");
        System.out.println("**************");

        int total=5;
        int score=0;

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            for(String option:options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            Scanner scanner=new Scanner(System.in);
            char answer=scanner.next().charAt(0);
            if(Character.toLowerCase(answer) == Character.toLowerCase(correct[i])){
                System.out.println("*********");
                System.out.println("CORRECT!");
                System.out.println("*********");
                score++;
            }

            else{
                System.out.println("*********");
                System.out.println("WRONG!");
                System.out.println("*********");
            }
        }

        System.out.printf("Your total score is: %d/%d",score,total);
    }
}
