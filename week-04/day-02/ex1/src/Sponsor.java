public class Sponsor {
    private String company;
    private int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a age " + " years old " + gender + " who represents " company + "and hired " + hiredStudents + " students so far.");
    }
    public void hire(){
        hiredStudents +=1;
    }
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor (name, age, gender, company) {
        company = "Google";
        hiredStudents = 0;
    }
}
