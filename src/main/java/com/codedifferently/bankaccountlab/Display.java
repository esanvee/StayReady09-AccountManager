package com.codedifferently.bankaccountlab;

public class Display {

    public static void banksToString(){
        int count = 0;

        for(BankAccount bank: MainApplication.bankAccounts){
            System.out.print("\n" + bank.getAccountType() + "(" + count + ")");
            count++;

        }

        System.out.print("\nCreate an account" + "(" + (count) + ")");
        System.out.print("\nDelete an account" + "(" + (count+1) + ")");

        System.out.print("\n");
    }

    public static void print(String msg){

        System.out.println("\n" + msg + "\n");

    }

    

}