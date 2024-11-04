package ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            System.out.println("***");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator ");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("rest of main");
        }
    }
