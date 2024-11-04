package Operator;

public class Assign13 {
    public static void main(String[] args) {
        int num1= 12345;
        int num2=num1/10000;
        int num3=(num1/10)%10;

        int sum= num2+num3;
        System.out.println("Number: "+num1);
        System.out.println("output: "+ num2 + "+" +num3+ "="+sum);

    }
}
