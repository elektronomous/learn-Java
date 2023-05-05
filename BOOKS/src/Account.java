//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Account.java (Chapter 3, page 92)                        //
//////////////////////////////////////////////////////////////

public class Account {
  // Instance variables
  private double balance;

  // Constructors
  public Account(double initialBalance) {
    balance = initialBalance;
  }

  public Account() {
    balance = 0.0;
  }

  // Instance methods
  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }

  public void close() {
    balance = 0.0;
  }
}
