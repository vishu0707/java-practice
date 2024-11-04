package Assignment.InputByUser;

import java.util.Scanner;

public class Assign10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("marks of sub1");
        int num1= sc.nextInt();

        System.out.println("marks of sub2");
        int num2= sc.nextInt();

        System.out.println("marks of sub3");
        int num3= sc.nextInt();

        int totalMarks = num1+num2+num3;
        int percentages =totalMarks / 3;

        System.out.println(""+ totalMarks);
        System.out.println(""+ percentages);




    }
}
