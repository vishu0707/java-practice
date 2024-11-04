package Assignment.IfElse;

import java.util.Scanner;

public class Assign1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length  of Reactangle : ");
        double length= sc.nextDouble();

        System.out.println("Enter the breadth of Reactangle : ");
         double Breadth=sc.nextDouble();

         if (length==Breadth){
            System.out.println("the Reactangle is a square  ");
        }else {
            System.out.println("The Reactangle is not square");
         }
    }
}
