package Assignment.ConditionalOperator;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number");
         int num= Sc.nextInt();

         if(num%2==0 && num%3==0) {
             System.out.println(num+"is diviable by both 2 and 3");
         }else {
             System.out.println(num+"is not diviable by both 2 and 3");

         }

    }
}

