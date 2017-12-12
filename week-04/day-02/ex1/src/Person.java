public class Person {
    private String name;
    private int age;
    private String gender;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a" + age + "year old" + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person (name, age, gender){}
    public Person(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

}
