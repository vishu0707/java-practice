package ExceptionHandling;

import com.sun.source.tree.CatchTree;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println("10/2");
            String str = "shreyash";
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        catch (NullPointerException nullPointerException){
        System.out.println("null option");
    }
        finally {
            System.out.println(" finally block");
        }
        System.out.println(" rest of main");
      }
    }
