package Operator;

public class Assign17 {
    public static void main(String[] args) {
        int number=123;
        int num1=number%10;
        int num2=(number/10)%10;
        int num3=(number/100);

       int  newnumber=num1*100+num2*10+num3;
        System.out.println("revers the number "+newnumber);
    }
}
