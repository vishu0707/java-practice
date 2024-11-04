package ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);//Arithmatic exception

            System.out.println("***");
        }
        finally {
            System.out.println("finally Block");

        }
    }
}
