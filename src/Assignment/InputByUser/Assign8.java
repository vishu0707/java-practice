package Assignment.InputByUser;

import java.util.Scanner;

public class Assign8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the frist number");
         int number1=sc.nextInt();

        System.out.println("Enter the second number");
         int number2=sc.nextInt();

        System.out.println("Enter the third  number");
         int number3=sc.nextInt();

         if(number1 == number2 && number2==number3){
            System.out.println(" ALL numbers is equal");
        } else if (number1==number2 || number2==number3 || number1==number3) {
             System.out.println(" any tow numbers are  equal");
         }else {
             System.out.println("the numbers are not equal");
         }
    }
}
