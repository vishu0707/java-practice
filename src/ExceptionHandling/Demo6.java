package ExceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
     try {
         System.out.println(10 / 0);
         System.out.println("***");
     }catch( NullPointerException nullpointerException ) {
         System.out.println("handel npe");
     }
     finally{
         System.out.println("finally Block");
     }
        System.out.println("rest of main");
    }

    }

