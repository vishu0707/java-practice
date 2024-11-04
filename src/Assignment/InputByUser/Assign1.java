package Assignment.InputByUser;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.println("Enter the frist number");
        int number1 = Scanner.nextInt();

        System.out.println("Enter the second number");
        int number2 = Scanner.nextInt();

        int Sum = (number1 + number2);
        int Product = (number1 * number2);

        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + Sum);
        System.out.println("Product of " + number1 + " and " + number2 + " is: " + Product);

    }
}
