package Assignment.IfElse;

import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int marks = sc.nextInt();

        char grade = 0;
        if (marks < 25) {
            grade = 'F';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks < 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Enter the grade"+grade);
    }
}

