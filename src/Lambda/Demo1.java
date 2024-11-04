package Lambda;
public class Demo1 {
    public static void main(String[] args) {
        abstract class parent {
            abstract void m1();
        }
        // traditional way
        class Child extends parent {
            @Override
            void m1() {
                System.out.println("child method");
            }
        }
    }
}