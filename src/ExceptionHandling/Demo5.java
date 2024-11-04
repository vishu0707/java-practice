package ExceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("***");
        }catch(NullPointerException nullPointerException) {
            System.out.println("cathch Block");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Rest of main ");

        }
    }

