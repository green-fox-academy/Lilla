public class Student extends Person implements Cloneable{
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    skippedDays = 0;
    previousOrganization = " The School of Life";
  }

  public Student (String name,int  age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce () {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "years old" +  getGender() + " from "
            + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  @Override
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }
}
