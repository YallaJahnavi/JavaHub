class Person {
    String name;
    Person() {
        System.out.println("Person Constructor");
    }
    Person(String name) {
        this.name = name;
        System.out.println("Person Constructor: " + name);
    }
}
class Stu extends Person {
    Stu() {
        super(); 
        System.out.println("Student Constructor");
    }
    Stu(String name) {
        super(name);
        System.out.println("Student Constructor with Name");
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        Stu s2 = new Stu("John");
    }
}


