package com.company;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(int id, double startBal, double IR){
        super(id, startBal);
        interestRate = IR;
    }

    public void withdraw(double amountW){
        if (currentBalance() > amountW) {
            decreaseBalance(amountW);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    public double monthlyInterest() {
        return currentBalance() * interestRate / 12;
    }
}
