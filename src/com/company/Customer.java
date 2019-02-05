package com.company;

public class Customer {

//  Customer has id, name, cash on hand
//  Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    this.id = maxId++;
    this.name = name;
    this.cash = cash;
  }

  public double buySnack(int quantity, double price) {

      double cost = quantity * price;

      if(cost <= cash) {
        cash -= cost;

      } else {
        System.out.println("Not enough money");
      }
      return cost;


  }

  public double findMoney(double extraCash) {
      cash += extraCash;
      return extraCash;
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
