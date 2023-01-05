//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// TestAccount.java (Chapter 3, page 97)                    //
//////////////////////////////////////////////////////////////

public class TestAccount {
  public static void main(String[] args) {
    Account acct1 = new Account(1000.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.deposit(100.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.withdraw(150.00);
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());
    acct1.close();
    System.out.println("Balance in account 1: " +
                       acct1.getBalance());

    Account acct2 = new Account();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.deposit(500.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.withdraw(350.00);
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
    acct2.close();
    System.out.println("Balance in account 2: " +
                       acct2.getBalance());
  }
}
