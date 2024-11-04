package Assignment.InputByUser;

import java.util.Scanner;

import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = scanner.next();

        System.out.println("Enter the Roll number:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Field of interest:");
        String fieldOfInterest = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Field of Interest: " + fieldOfInterest);

        scanner.close();
    }
}
