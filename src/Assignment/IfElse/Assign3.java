package Assignment.IfElse;

import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Salary");
        double Salary= sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();

        double bouns=0;
        if(yearsOfService>5) {
            bouns = Salary * 0.5;
        }
        System.out.println("your net bonus Amount is : "+bouns);
        }

    }

