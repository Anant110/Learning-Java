package Core_Java_Concepts.Practice_problems;

import java.util.Scanner;

public class Banking_system {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        double balance=0.00;
        boolean isRunning=true;

        while(isRunning){
            System.out.println("**************");
            System.out.println("BANKING SYSTEM");
            System.out.println("**************");
            System.out.println("1.SHOW BALANCE");
            System.out.println("2.MONEY DEPOSIT");
            System.out.println("3.MONEY WITHDRAW");
            System.out.println("4.EXIT");
            System.out.println("****************");
            System.out.print("Enter choice between (1-4): ");
            int choice=scanner.nextInt();
            switch (choice){
                case 1->showBalance(balance);
                case 2-> balance+=moneyDeposit();
                case 3-> {
                    if(balance>0){
                        balance-=withDraw();
                    }
                    else{
                        System.out.println("Can't withdrawn amount from 0 Balance");
                    }
                }
                case 4-> isRunning=false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("****************");
        System.out.println("THANK YOU HAVE A NICE DAY");
        System.out.println("****************");
    }

    //Show Balance
    public static void showBalance(double balance){
        System.out.printf("%.2f is Balance in your account\n",balance);
    }

    //Money Deposit
    public static double moneyDeposit(){
        System.out.print("Enter the amount of money you want to deposit in Bank in $: ");
        double num=scanner.nextInt();
        if(num<0){
            System.out.println("Invalid amount of money");
            return 0;
        }
        else{
            System.out.println("Money is deposited successfully");
            return num;
        }
    }

    //Withdraw amount
    public static double withDraw(){
        System.out.print("Enter the amount to be withdrawn from bank: " );
        int withdraw=scanner.nextInt();
        if(withdraw<0){
            System.out.println("Invalid withdrawn Amount");
            return 0;
        }
        else{
            System.out.println("Successfully withdrawn amount");
            return withdraw;
        }
    }
}
