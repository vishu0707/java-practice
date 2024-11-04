package Assignment.ConditionalOperator;

import java.util.Scanner;

public class Deno7 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the year :");
        int year = Sc.nextInt();
        boolean isleap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0 || year % 400 == 0) {
                isleap = true;
            }
        }
        if (isleap) {
            System.out.println("year is leap year" + year);

        } else {
            System.out.println("year is not leap year" + year);
        }
    }
}

