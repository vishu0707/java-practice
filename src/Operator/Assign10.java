package Operator;

public class Assign10 {
    public static void main(String[] args) {
        int num1=6;
        int num2=8;
        System.out.println("before swap" );
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
        int temp=num1;
             num1=num2;
             num2=temp;

        System.out.println("after swap" );
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
    }
}

