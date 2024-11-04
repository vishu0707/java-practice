package Assignment.ConditionalOperator;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        if(num1<num2){
            System.out.println("num1 is less then num2");
        } else if (num1<num3) {
            System.out.println("num1 is less then num3");
        }else if (num2<num3) {
            System.out.println("num2 is less then num3");
        }
        else {
            System.out.println("invalid number");



        }
    }
}
