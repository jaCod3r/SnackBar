package com.company;

public class Customer {

//  Customer has id, name, cash on hand
//  Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(int id, String name, double cash) {
    this.id = id;
    this.name = name;
    this.cash = cash;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCash() {
    return cash;
  }

  public void setCash(double cash) {
    this.cash = cash;
  }


}
