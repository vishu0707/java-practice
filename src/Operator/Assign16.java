package Operator;

public class Assign16 {
    public static void main(String[] args) {
        int number=123;
        int num1= number/100;
        int num2=(number/10)%10;
        int num3=number%10;

        int sum =num1+num2+num3;
        System.out.println("Number: "+num1);
        System.out.println("output: "+ num2 + "+" +num3+ "="+sum);

    }
}
