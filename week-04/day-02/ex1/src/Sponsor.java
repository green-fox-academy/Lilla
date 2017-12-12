public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor() {
        company = "Google";
        hiredStudents = 0;
    }

    public Sponsor (String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a age " + " years old " + getGender() + " who represents " + company + "and hired " + hiredStudents + " students so far.");
    }
    public void hire(){
        hiredStudents +=1;
    }
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }


}
