public class Main {
    public static void main(String[] args) {
        // Create University
        University university = new University();

        // Create Lab Attendant
        Employee labAttendant = new Employee("L001", "John Doe");

        // Create Computer
        Computer computer1 = new Computer("C001", "LCD Model 1", 8, 512, true);

        // Create Lab
        Lab lab1 = new Lab("Lab101",LabStatus.OPERATIONAL,labAttendant);
        lab1.addComputer(computer1);

        // Add Lab to University
        university.addLab(lab1);


    }
}