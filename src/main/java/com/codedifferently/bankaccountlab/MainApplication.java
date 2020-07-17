package com.codedifferently.bankaccountlab;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    static ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();


    static Scanner in = new Scanner(System.in);
    static int selection; //I want only one selection object
    static BankAccount currentAccount;

    public static void main(String args[]){

        CheckingAccount checking1 = new CheckingAccount("Reigen", 1267823);
        SavingsAccount savings1 = new SavingsAccount("Reigen", 867553);
        BusinessAccount business1 = new BusinessAccount("Spirits and Such", 23342, 21932138);

        bankAccounts.add(checking1);
        bankAccounts.add(savings1);
        bankAccounts.add(business1);
        bankAccounts.add(savings1);

        //Lessgooooo!

        System.out.println("Welcome to StayReady Banking! Please select an account.");
        login();





        

        






        in.close();//done!
    }

    public static void login(){


        Display.banksToString();

        selection = in.nextInt();

        if(selection < bankAccounts.size()){

            currentAccount = bankAccounts.get(selection);

         }else if (selection == bankAccounts.size()){

             Display.print("Create an account");
             return;

         }else if (selection == bankAccounts.size() + 1){

            Display.print("Delete an account");
            return;
        }else{
            Display.print("Try again.");
            login();
            return;
        }



        ///Account is selected
        ///Login with password


        Display.print("Selected account: " + currentAccount.getAccountType() + ". Please log in.");

        int password = in.nextInt();

        if (password == currentAccount.getPin()){

            Display.print("Logged in!");

            return;

        }else{

            Display.print("Incorrect pin. Please select an account");
            login();
            return;
        }
    }

    



}
