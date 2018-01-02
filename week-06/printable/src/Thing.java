public class Thing implements Printable {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public void printAllFields() {
    if (completed == true) {
      System.out.println(name + " completed");
    } else {
      System.out.println(name + " uncompleted");
    }
  }
}
