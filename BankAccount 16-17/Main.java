package com.company;

public class Main {

    public static void main(String[] args) {
        myBanks();
    }
    public static void myBanks(){
        BankAccount [] arrayOfBankAccounts = new BankAccount[]{
                new BankAccount("someone", -50001,50,false),
                new BankAccount("someone", 15000,60,false),
                new BankAccount("someone", -10001,60,false),
        };
        for (int i = 0; i < arrayOfBankAccounts.length; i++){
            arrayOfBankAccounts[i].checkBalance();
        }
        float maxCreditScore = 0;
        for (int i = 0; i < arrayOfBankAccounts.length; i++){
            if (arrayOfBankAccounts[i].creditScore >= maxCreditScore){
                maxCreditScore = arrayOfBankAccounts[i].creditScore;
            }
        }
        for (int i = 0; i < arrayOfBankAccounts.length; i++){
            if (arrayOfBankAccounts[i].creditScore == maxCreditScore){
                arrayOfBankAccounts[i].deposit(1000);
            }
        }
        for (int i = 0; i < arrayOfBankAccounts.length; i++){
            System.out.println(arrayOfBankAccounts[i]);
        }
    }

}
