package com.company;

public class VendingMachine {
  private int id;
  private String name;

  public VendingMachine(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
