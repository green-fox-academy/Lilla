public class Mentor extends Person {
    private String level;

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
    }

    public Mentor (name, age, gender, level) {
        //name = "Jane Doe";
        //age = 30;
        //gender = "female";
        level = "intermadiate";
    }
}
