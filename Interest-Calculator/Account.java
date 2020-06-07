package com.InterestCalculator;
import java.math.*;
import java.text.DecimalFormat;

public abstract class Account {
    DecimalFormat df = new DecimalFormat("#,###.0");
    double interestRate;
    double amount;
    int ageOfACHolder;
    int timeSpent;
    double sum;
    abstract double calculateInterest();
    abstract double calculateSum(double amount,double interestRate,int timeSpent);
    abstract void displayDetails();
}
class FDAccount extends Account {
    public double interestRate;
    double amount;
    int timeSpent;
    int ageOfACHolder;
    double sum;
    FDAccount(double amount,int ageOfACHolder,int timeSpent){
        this.amount=amount;
        this.ageOfACHolder=ageOfACHolder;
        this.timeSpent=timeSpent;
        this.interestRate=calculateInterest();
    }
    double calculateInterest() {
        if (amount > 1000000) {
            if (timeSpent >= 7 && timeSpent < 15) interestRate = 6.5;
            else if (timeSpent >= 15 && timeSpent < 30) interestRate = 6.75;
            else if (timeSpent >= 30 && timeSpent < 45) interestRate = 7.75;
            else if (timeSpent >= 45 && timeSpent < 61) interestRate = 8.00;
            else if (timeSpent >= 61 && timeSpent < 185) interestRate = 8.50;
            else interestRate = 10.00;
        } else if (amount < 1000000 && ageOfACHolder < 45) {
            if (timeSpent >= 7 && timeSpent < 15) interestRate = 4.50;
            else if (timeSpent >= 15 && timeSpent < 30) interestRate = 4.75;
            else if (timeSpent >= 30 && timeSpent < 45) interestRate = 5.50;
            else if (timeSpent >= 45 && timeSpent < 61) interestRate = 7.00;
            else if (timeSpent >= 61 && timeSpent < 185) interestRate = 7.50;
            else interestRate = 8.00;
        } else {
            if (timeSpent >= 7 && timeSpent < 15) interestRate = 5.00;
            else if (timeSpent >= 15 && timeSpent < 30) interestRate = 5.25;
            else if (timeSpent >= 30 && timeSpent < 45) interestRate = 6.00;
            else if (timeSpent >= 45 && timeSpent < 61) interestRate = 7.50;
            else if (timeSpent >= 61 && timeSpent < 185) interestRate = 8.00;
            else interestRate = 8.50;
        }
        return interestRate;
    }
    double calculateSum(double amount,double interestRate,int timeSpent){
        //A = P (1+r/n) ^ (n * t)
        double rateDiv=1+(interestRate/400);
        double x=Math.pow(rateDiv,4*(timeSpent/365));
        sum=amount*x;
        return sum;
    }

    void displayDetails(){

        System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s",ageOfACHolder,timeSpent+" days",df.format(amount),interestRate,df.format(sum-amount),df.format(sum));
    }

}
class SBAccount extends Account {
    public double interestRate;
    double amount;
    int timeSpent;
    String type;
    SBAccount(double amount,String type,int timeSpent){
        this.amount=amount;
        this.type=type;
        this.timeSpent=timeSpent;
        this.interestRate=calculateInterest();
    }
    double calculateInterest() {
        if (type.equalsIgnoreCase("Yes")) interestRate = 6.00;
        else interestRate = 4.00;
        return interestRate;
    }
    double calculateSum(double amount,double interestRate,int timeSpent){
        //A= P (1+(R/4)/100) ^4N
        sum = amount * (1 + (interestRate * timeSpent / 100));
        return sum;
    }
    void displayDetails(){
        System.out.format("%-5s%-15s%-15s%-15s",type,df.format(amount),df.format(sum-amount),df.format(sum));
    }
}

class RDAccount extends Account {
    public double interestRate;
    double amount;
    int timeSpent;
    int ageOfACHolder;
    RDAccount(double amount,int ageOfACHolder,int timeSpent){
        this.amount=amount;
        this.ageOfACHolder=ageOfACHolder;
        this.timeSpent=timeSpent;
        this.interestRate=calculateInterest();
    }
    double calculateInterest(){
        if(ageOfACHolder<45){
            if (timeSpent > 6 && timeSpent < 9) interestRate = 7.50;
            else if (timeSpent >= 8 && timeSpent < 12) interestRate=7.75;
            else if (timeSpent >= 11 && timeSpent < 15) interestRate=8.00;
            else if (timeSpent >= 14 && timeSpent < 18) interestRate=8.25;
            else if (timeSpent >= 17 && timeSpent < 21) interestRate=8.50;
            else interestRate=8.75;
        }
        else {
            if (timeSpent > 6 && timeSpent < 9) interestRate = 8.00;
            else if (timeSpent >= 9 && timeSpent < 12) interestRate=8.25;
            else if (timeSpent >= 12 && timeSpent < 15) interestRate=8.50;
            else if (timeSpent >= 15 && timeSpent < 18) interestRate=8.75;
            else if (timeSpent >= 18 && timeSpent < 21) interestRate=9.00;
            else interestRate=9.25;
        }
        return interestRate;
    }
    double calculateSum(double amount,double interestRate,int timeSpent){
        //M =R[(1+i)n – 1]/1-(1+i)(-1/3)
        double rateDiv=1+(interestRate/400);
        double x=Math.pow(rateDiv,-0.3333334);
        double y=Math.pow(rateDiv,(timeSpent*0.33333));
        sum=amount*(y-1)/(1-x);
        return sum;
    }
    void displayDetails(){
        System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s",ageOfACHolder,timeSpent+" months",df.format(amount*timeSpent),interestRate,df.format(sum-(amount*timeSpent)),df.format(sum));
    }
}