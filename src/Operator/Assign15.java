package Operator;

public class Assign15 {
    public static void main(String[] args) {
        int number = 1234;
        int num1= number/1000;
        int num2=(number/100)%10;
        int num3=(number/10)%10;
        int num4= number%10;

         num1+=2;
         num2+=2;
         num3+=2;
         num4+=2;

        int newNumber=num1*3000+num2*100+num3*10+num4*6;
        System.out.println("Digit is greter then 2 is  :"+newNumber);

    }
}
