package Assignment.InputByUser;

import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth:" );

        double lenth= scanner.nextDouble();
        double bridth= scanner.nextDouble();
        double area =  (lenth * bridth);
         int finalArea=(int)area;

        System.out.println("Final area is " + finalArea);



    }
}
