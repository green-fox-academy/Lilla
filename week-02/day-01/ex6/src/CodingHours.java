public class CodingHours {
    public static void main(String[] args) {
        int codingHoursDaily = 6;
        int workingDAys = 5;
        int semester = 17;
        int averageCodingAWeek = 52;
        int codingHoursPerSemester = codingHoursDaily * workingDAys * semester;
        System.out.println(codingHoursPerSemester);
        System.out.println( (codingHoursPerSemester * 0.1) / (averageCodingAWeek * semester *0.1) *100) ;
    }
}
