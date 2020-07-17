package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    

    /*

    //Reading account information

    */


    public abstract Integer getAccountNumber();

    public abstract AccountType getAccountType();
   

    public abstract int getPin();

    public abstract void setPin(int pin);

    


    /*

    //Deposit and withdrawing money

    */

    public abstract double GetBalance();

    public abstract void deposit(Double amount);

    public abstract Double withdraw(Double amount);
    
   


    
}