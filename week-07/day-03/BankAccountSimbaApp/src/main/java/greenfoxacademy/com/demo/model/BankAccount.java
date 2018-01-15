package greenfoxacademy.com.demo.model;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {

  private String name;
  private double balance;
  private String currency;
  private String animalType;
  private boolean isKing;
  private boolean isBad;



  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    currency = "Zebra";
    this.animalType = animalType;
    isKing = false;
    isBad = false;
  }



  public BankAccount(String name, int balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    currency = "Zebra";
    this.animalType = animalType;
    this.isKing = isKing;
    isBad = false;
  }

  public BankAccount( boolean isBad, String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    currency = "Zebra";
    this.animalType = animalType;
    this.isBad = isBad;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCurrency() {
    return currency;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isBad() {
    return isBad;
  }

  @Override
  public String toString() {
    return getName() + " " + String.format("%.2", getBalance()) + "0 " + getCurrency() + " " + getAnimalType();
  }

  public void raise() {
    if (isKing() == true ) {
      setBalance(getBalance() + 100);
    } else {
      setBalance(getBalance() + 10);
    }
  }
}
