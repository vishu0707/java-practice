package Assignment.InputByUser;

import java.util.Scanner;

public class Assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter square of number");
        int number= sc.nextInt();
         int Square = (number*number);
        System.out.println("Square of number is :"+ Square);
    }
}
