import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Sorting by name (Default sorting)
    public int compareTo(Student1 s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Charlie", 22));
        students.add(new Student1("Alice", 20));
        students.add(new Student1("Bob", 21));

        Collections.sort(students); // Uses Comparable
        System.out.println(students);
    }
}
