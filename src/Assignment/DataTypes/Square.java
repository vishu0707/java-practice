package Assignment.DataTypes;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        double square =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        double n=sc.nextDouble();

        square=n*n;
        System.out.println("the square is :"+square);
    }
}
