package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount{

    private final Integer accountNumber;
    private final AccountType accountType;
    private final Integer taxID;

    private String companyName;
    private double balance;
    private int pin = 123;

    public BusinessAccount(String companyName, Integer taxID, Integer accountNumber){
        
        this.companyName = companyName;
        this.accountType = AccountType.BUSINESS; //set to business account
        this.taxID = taxID; //set tax ID
        this.accountNumber = accountNumber; //set and finalize acct number

    }

    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public Integer getTaxID(){
        return this.taxID;
    }



    /*

    //Deposit and withdrawing money

    */

    public double GetBalance(){
        return this.balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public Double withdraw(Double amount){

        this.balance -= amount;
        return amount;

    }

    /*
    Pin number stuff
    */

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getPin() {
        return this.pin;
    }

   
    
    
}