package com.InterestCalculator;
import com.InterestCalculator.NegativeNumberException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        startInterestCalculator();
        printActions();
        while (!quit) {
            System.out.println("\n\nEnter your option or enter 4 to display main menu.\n\n");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit=true;
                    break;

                case 1:
                    calcSavingsAccountInterest();
                    break;
                case 2:
                    calcFixedAccountInterest();
                    break;
                case 3:
                    calcRecurringAccountInterest();
                    break;
                case 4:
                    printActions();
                    break;

            }

        }
    }
    private static void calcSavingsAccountInterest(){
        try {
            System.out.println("\nSavings Account Deposit Calculator\n\n");
            System.out.println("Enter the amount you wish to deposit: ");
            int amount = sc.nextInt();
            sc.nextLine();
            System.out.println("Are you an NRI? ");
            String type = sc.nextLine();
            System.out.println("Enter the time in years: ");
            int timeSpent = sc.nextInt();
            if(amount<0||timeSpent<0) throw new NegativeNumberException();
            SBAccount SBNew=new SBAccount(amount,type,timeSpent);
            SBNew.calculateSum(amount,SBNew.interestRate,timeSpent);
            System.out.println("Your account details are as follows: ");
            System.out.format("%-5s%-15s%-15s%-15s","NRI","Amount","Interest","Sum");
            System.out.println();
            SBNew.displayDetails();
            }
        catch (NegativeNumberException e){
            System.out.println(e.toString());
            }
    }
    private static void calcFixedAccountInterest(){
        try {
            System.out.println("\nFixed Deposit Calculator\n\n");
            System.out.println("Enter the amount you wish to deposit: ");
            int amount = sc.nextInt();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Enter the time spent on this account in days: ");
            int timeSpent = sc.nextInt();
            if(amount<0||timeSpent<0||age<0) throw new NegativeNumberException();
            FDAccount FDNew = new FDAccount(amount, age, timeSpent);
            FDNew.calculateSum(amount, FDNew.interestRate, timeSpent);
            System.out.println("Your account details are as follows - ");
            System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s", "Age", "Time Spent", "Amount", "Interest", "Earnings", "Sum");
            System.out.println();
            FDNew.displayDetails();
        }
        catch (NegativeNumberException e){
            System.out.println(e.toString());
        }
    }
    private static void calcRecurringAccountInterest(){
        try {
            System.out.println("\nRecurring Deposit Calculator\n\n");
            System.out.println("Enter the amount you wish to  per month: ");
            int amount = sc.nextInt();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Enter the time in months: ");
            int timeSpent = sc.nextInt();
            if(amount<0||timeSpent<0||age<0) throw new NegativeNumberException();
            RDAccount RDNew = new RDAccount(amount, age, timeSpent);
            RDNew.calculateSum(amount, RDNew.interestRate, timeSpent);
            System.out.println("Your account details are as follows - ");
            System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s", "Age", "Time Spent", "Amount", "Interest", "Earnings", "Sum");
            System.out.println();
            RDNew.displayDetails();
        }
        catch (NegativeNumberException e){
            System.out.println(e.toString());
        }
    }
    private static void startInterestCalculator(){
        System.out.println("\n\n\nCreated by Srijan Srivastava.\nDisplaying main menu.\n\n\n");
    }
    private static void printActions(){
        System.out.println("\nAvailable options:\n");
        System.out.println("0 - Shutdown\n"+
                "1 - Savings Account\n"+
                "2 - Fixed Account\n"+
                "3 - Recurring Account\n"+
                "4 - Print the list of options available\n");
    }
}
