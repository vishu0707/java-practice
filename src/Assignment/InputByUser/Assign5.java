package Assignment.InputByUser;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side & Square");
        int side= sc.nextInt();

        int area = side*side;
        int perimeter = 4*side;

        System.out.println("print the area"+area);
        System.out.println("print the perimeter"+perimeter);
    }
}
