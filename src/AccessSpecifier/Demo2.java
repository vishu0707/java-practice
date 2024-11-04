package AccessSpecifier;
/*
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Demo1.a);//public
      //  System.out.println(Demo1.b); //private --> CTE
        System.out.println(Demo1.c); //protected
        System.out.println(Demo1.d); //default
    }
}
*/      class Student {
    private int id;
    private String name;
    private int age;

    private Student() {

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.age=34;
        s.id=101;
        s.name="pranay";
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.age);



    }
}