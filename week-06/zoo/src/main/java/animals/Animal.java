package main.java.animals;

public abstract class Animal {

  protected String name;
  protected int age;
  protected float weight;
  protected String color;
  protected String habitat;

  public Animal(String name) {
    this.name = name;
  }

  public Animal() {
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
  public abstract void eat();
}
