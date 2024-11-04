package Assignment.InputByUser;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
         int number = Scanner.nextInt();

         System.out.println("Enter the frist number");
         int number1= Scanner.nextInt();

        System.out.println("Enter the second number");
        int number2= Scanner.nextInt();

        int sum=number1+number2;
        int product=number1*number2;

        int finalresult=sum+product;
        int finalproduct=sum*product;

        System.out.println(" sum of numbers :" +sum);
        System.out.println(" product of numbers :" +product);
        System.out.println("final result :" +finalproduct);
        System.out.println(" final result :" +finalresult);


    }
}
