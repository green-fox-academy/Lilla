public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce () {
        System.out.println("Hi, I'm " + name + ", a " + age + "years old" +  gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(numberOfDays) {
        skippedDays + numberOfDays;
        // todo init numberOfDays and read getter setter thing to manage this skipped days
    }

    Student(name, age, gender, previousOrganization) {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = " The School of Life";
        skippedDays = 0;
    }

}
