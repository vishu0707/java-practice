package OOPS.Inheritance;

public class Demo3 {
    public static void main(String[] args) {
        class A {
            static {
                System.out.println("A static block");

            }

            {
                System.out.println("A instance block");
            }

            A() {
                super();
                System.out.println("A constracter ");
            }

            class B extends A {
                static {
                    System.out.println("static Block");

                }

                {
                    System.out.println("A Static Block");
                }
            }
        }

    }
}


