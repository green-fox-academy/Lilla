import java.util.ArrayList;
import java.util.List;

public class PallindaClass {
    String className;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors= new ArrayList<>();

    addStunden (Student student) {
        students.add(student);
    }

    addMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    info(){
        System.out.println("Pallida " + className + " class has " + students.size + " students and " + mentors.size + " mentors.");
    }

    public PallindaClass (className){
        students = null;
        mentors = null;
    }
}
