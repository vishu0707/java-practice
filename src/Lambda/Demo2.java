package Lambda;

// Define the interface outside the main method
interface A {
    void m1();
    void m2();
}

public class Demo2 {
    public static void main(String[] args) {

        // Traditional way using a separate class that implements the interface
        class B implements A {
            @Override
            public void m1() {
                System.out.println("child class method : m1");
            }

            @Override
            public void m2() {
                System.out.println("child class B : m2");
            }
        }

        A a = new B();
        a.m1();
        a.m2();

        // Using an anonymous class
        A anon = new A() {
            @Override
            public void m1() {
                System.out.println("Anonymous class method : m1");
            }

            @Override
            public void m2() {
                System.out.println("Anonymous class method : m2");
            }
        };

        anon.m1();
        anon.m2();
    }
}
