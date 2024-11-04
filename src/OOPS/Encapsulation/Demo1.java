package OOPS.Encapsulation;

    public class Demo1 {
        public static void main(String[] args) {
            class Student{
                private String name ;
                private int age;

                //constructor
                public Student(String name , int age) {
                    this.name = name;
                    this.age = age;
                }
                // gettter method
                public String getName() {
                    return name;
                }
                //setter method
                public void setName(String name) {
                    this.name = name;
                }
                //Getter Method
                public int getAge() {
                    return age;
                }
                // Setter Method
                public void setAge(int age){

                    this.age=age;
                }
            }
        }
    }



