package com.company;

public class SpecialCheckingAccount extends CheckingAccount {

    private double interestRate;
    private double minimumBal;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double IR, double minBal){
        super(idNumber, startBal, cc);
        interestRate = IR;
        minimumBal = minBal;
    }

    public void clearCheck(double amount) {
        if (currentBalance() > minimumBal) {
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest() {
        if (currentBalance() > minimumBal) {
            return currentBalance() * interestRate / 12;
        } else {
            return super.monthlyInterest();
        }
    }


}
