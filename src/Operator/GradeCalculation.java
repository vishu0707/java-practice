package Operator;

public class GradeCalculation  {
    public static void main(String[] args) {
        // Total number of students and boys
        int totalStudents = 90;
        int totalBoys = 45;

        // Percentage of students securing grade 'A....'
        int percentageGradeA = 50;

        // Number of students securing grade 'A'
        int studentsGradeA = (totalStudents * percentageGradeA) / 100;

        // Number of boys securing grade 'A'
        int boysGradeA = 20;

        // Calculate the number of girls securing grade 'A'
        int girlsGradeA = studentsGradeA - boysGradeA;

        // Output the result
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }
}

