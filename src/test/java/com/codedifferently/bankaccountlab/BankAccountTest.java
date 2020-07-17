package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    @Test

    public void testgetCheckingAccountNumber(){

        CheckingAccount testChecking = new CheckingAccount("Bobbina",12345);

        int expected = 12345;
        int actual = testChecking.getAccountNumber();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDepositIntoCheckingAccount(){

        double amount = 100;
        CheckingAccount testChecking = new CheckingAccount("Bobbina2",12345);

        testChecking.deposit(amount);

        double expected = amount;
        double actual = testChecking.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testWithdrawFromCheckingAccount(){

        double amount = 100;
        double withdrawl = 50;
        CheckingAccount testChecking = new CheckingAccount("Bobbina3",12345);

        testChecking.deposit(amount);
        testChecking.withdraw(withdrawl);

        double expected = 50;
        double actual = testChecking.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void testgetBusinessAccountNumber(){

        BusinessAccount testBusiness = new BusinessAccount("Reigen",22222, 100000);

        int expected = 100000;
        int actual = testBusiness.getAccountNumber();

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testDepositToBusinessAccount(){

        double amount = 100;
        
        BusinessAccount testBusiness = new BusinessAccount("Reigen",12345,192323);

        testBusiness.deposit(amount);
        

        double expected = 100 ;
        double actual = testBusiness.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testWithdrawFromBusinessAccount(){

        double amount = 100;
        double withdrawl = 50;
        BusinessAccount testBusiness = new BusinessAccount("Reigen",12345,192323);

        testBusiness.deposit(amount);
        testBusiness.withdraw(withdrawl);

        double expected = 50 ;
        double actual = testBusiness.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void testgetSavingsAccountNumber(){

        SavingsAccount testChecking = new SavingsAccount("Mobbu",12345);

        int expected = 12345;
        int actual = testChecking.getAccountNumber();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDepositIntoSavingsAccount(){

        double amount = 100;
        SavingsAccount testSavings = new SavingsAccount("Mobbu2",12345);

        testSavings.deposit(amount);

        double expected = amount;
        double actual = testSavings.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testWithdrawFromSavingsAccount(){

        double amount = 100;
        double withdrawl = 50;

        SavingsAccount testSavings = new SavingsAccount("Mobbu3",12345);

        testSavings.deposit(amount);
        testSavings.withdraw(withdrawl);

        double expected = 50;
        double actual = testSavings.GetBalance();

        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void depositIntoSavings(){

        double amount = 1000.0;

        CheckingAccount testChecking = new CheckingAccount("Bobbina3",12345);
        SavingsAccount testSavings = new SavingsAccount("Mobbu3",12345);


        testChecking.deposit(amount);
        testChecking.transferToSavings(testSavings, amount);

        double expected = amount;
        double actual = testSavings.GetBalance();

        Assert.assertEquals(expected, actual,0);

    }

    


}
