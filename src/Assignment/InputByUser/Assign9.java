package Assignment.InputByUser;

import java.util.Scanner;

public class Assign9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the value of A : ");
         int a =sc.nextInt();

        System.out.println("Enter the value of B :");
        int b =sc.nextInt();

        boolean result=(  (a<50) &&  (a<b)  );

        System.out.println("enter the result"+result);

    }
}
