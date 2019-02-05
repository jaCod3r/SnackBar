package com.company;

public class Snack {

//  Snack has id, name, quantity, cost, vending machine id
//  Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack( String name, int quantity, double cost, int vendingMachineId) {
    this.id = maxId++;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public int fill(int newQuantity) {
    quantity += newQuantity;
    return newQuantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getCost() {
    return cost;
  }
}
