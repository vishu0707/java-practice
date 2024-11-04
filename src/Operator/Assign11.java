package Operator;

public class Assign11 {
    public static void main(String[] args) {
        int num1=6;
        int num2=8;
        System.out.println("before swap :");
        System.out.println("num1 is "+num1 );
        System.out.println("num2 is "+num2);
          num1=num1+ num2;
          num2=num1-num2;
          num1=num1-num2;

        System.out.println("After swap : ");
        System.out.println("num1 is "+num1 );
        System.out.println("num2 is "+num2);

    }
}
