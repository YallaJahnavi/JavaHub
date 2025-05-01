import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
    String name;
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

// Custom Comparator for sorting by age
class AgeComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Charlie", 22));
        students.add(new Student2("Alice", 20));
        students.add(new Student2("Bob", 21));

        Collections.sort(students, new AgeComparator()); // Uses Comparator
        System.out.println(students);
    }
}
