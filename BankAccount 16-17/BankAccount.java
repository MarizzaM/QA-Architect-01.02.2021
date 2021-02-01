package com.company;

import lombok.ToString;

@ToString
public class BankAccount {
    public String ownerName;
    public float balance;
    public int creditScore;
    public boolean isFrozen;

    public BankAccount(String ownerName, float balance, int creditScore, boolean isFrozen) {
        this.ownerName = ownerName;
        this.balance = balance;
        if ( creditScore >= 1 && creditScore <= 100){
            this.creditScore = creditScore;
        } else System.out.println("Error");
        this.isFrozen = isFrozen;
    }

    public void withdraw (float money){
        if (isFrozen != true){
            this.balance -= money;
        } else {
            System.out.println("Account Bank is frozen");
        }
    }

    public void deposit (float money){
        this.balance += money;
    }

    public void checkBalance (){
        if (this.balance < -50000){
            this.isFrozen = true;
        }
        else if (this.balance < -10000){
            this.creditScore -= 10;
        }
    }
}
