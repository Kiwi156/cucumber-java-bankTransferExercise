package com.serenitydojo.bankingexercise;

public class Account {

    Integer balance;
    public Account(Integer amount) {
        this.balance = amount;
    }

    public Integer getBalance(){
        return balance;
    }

    public void transferTo(Account to, Integer amountToTransfer){
        this.withdraw(amountToTransfer);
        to.deposit(amountToTransfer);
    }
     public void deposit(Integer amountToTransfer){
        this.balance += amountToTransfer;
     }
     public void withdraw(Integer amountToTransfer){
        this.balance -= amountToTransfer;

     }
}
