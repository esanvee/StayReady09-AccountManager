package com.codedifferently.bankaccountlab;


public class CheckingAccount extends BankAccount{

    private final Integer accountNumber;
    private final AccountType accountType;
    private String userName;
    private double balance;
    private int pin = 123;

    
    public double annualFees;
    public double rates = 0.03;


    public CheckingAccount(String userName, Integer accountNumber){
        
        this.userName = userName;
        this.accountType = AccountType.CHECKING; //set to Checking account
        this.accountNumber = accountNumber; //set and finalize acct number

    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setFees(double rates){
        this.rates = rates;
    }

    public double getFees(){

        return this.annualFees; //return current amount of fees accumulated

    }

    /*
    *calculate how much you need to pay in fees
    */
    public double calculateFees(){ 

        annualFees += (this.GetBalance() * (1 + rates)); //Balance * 1.03

        //Calculate and return total fees
        return annualFees;
    }


    /*

    //Reading account information

    */


    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public AccountType getAccountType(){
        return this.accountType;
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

    public void transferToSavings(BankAccount account, double amount){

        if(account.getAccountType() == AccountType.SAVINGS){

            this.withdraw(amount);
            account.deposit(amount);

        }
        else{
            System.out.println("This is not a savings account");
        }


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