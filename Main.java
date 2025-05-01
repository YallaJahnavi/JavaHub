/*import java.util.ArrayList;

// Product class to represent individual products
class Product {
    String name;
    int quantity;

    // Constructor
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

// Inventory class to manage a collection of products
class Inventory {
    private ArrayList<Product> products; // List to store products

    // Constructor to initialize the product list
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(String name, int quantity) {
        products.add(new Product(name, quantity));
    }

    // Method to remove a product from the inventory
    public void removeProduct(String name) {
        products.removeIf(product -> product.name.equals(name));
    }

    // Method to check for low inventory (threshold: quantity < 5)
    public void checkLowInventory() {
        System.out.println("Checking for low inventory...");
        boolean foundLowStock = false;
        for (Product product : products) {
            if (product.quantity < 5) {
                System.out.println("Low inventory: " + product.name + " (Quantity: " + product.quantity + ")");
                foundLowStock = true;
            }
        }
        if (!foundLowStock) {
            System.out.println("No products with low inventory.");
        }
    }
}

// Main class to test the Inventory system
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products to inventory
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 3);
        inventory.addProduct("Keyboard", 2);

        // Checking for low inventory
        inventory.checkLowInventory();

        // Removing a product and checking inventory again
        inventory.removeProduct("Mouse");
        System.out.println("\nAfter removing Mouse:");
        inventory.checkLowInventory();
    }
}*/


import java.util.ArrayList;

// Student class representing a student
class Students {
    private String name;
    private int age;

    // Constructor
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
}

// Teacher class representing a teacher
class Teacher {
    private String name;
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getter methods
    public String getName() { return name; }
    public String getSubject() { return subject; }
}

// SchoolClass class representing a class
class SchoolClass {
    private String className;
    private Teacher teacher;
    private ArrayList<Students> students;

    // Constructor
    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    // Methods to add and remove students
    public void addStudent(Students student) {
        students.add(student);
    }

    public void removeStudent(String studentName) {
        students.removeIf(student -> student.getName().equals(studentName));
    }

    // Getter methods
    public String getClassName() { return className; }
    public Teacher getTeacher() { return teacher; }
    public ArrayList<Students> getStudents() { return students; }
}

// School class managing students, teachers, and classes
class School {
    private ArrayList<Students> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> classes;

    // Constructor initializing lists
    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    // Methods to add students, teachers, and classes
    public void addStudent(Students student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    // Methods to remove students, teachers, and classes
    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public void removeTeacher(String name) {
        teachers.removeIf(teacher -> teacher.getName().equals(name));
    }

    public void removeClass(String className) {
        classes.removeIf(schoolClass -> schoolClass.getClassName().equals(className));
    }

    // Getter methods
    public ArrayList<Students> getStudents() { return students; }
    public ArrayList<Teacher> getTeachers() { return teachers; }
    public ArrayList<SchoolClass> getClasses() { return classes; }
}

// Main class to test the School Management System
public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Creating students
        Students s1 = new Students("x", 15);
        Students s2 = new Students("y", 16);
        Students s3 = new Students("z", 14);

        // Creating teachers
        Teacher t1 = new Teacher("A", "Math");
        Teacher t2 = new Teacher("B", "English");

        // Creating classes
        SchoolClass class1 = new SchoolClass("Math Class", t1);
        SchoolClass class2 = new SchoolClass("English Class", t2);

        // Adding students to classes
        class1.addStudent(s1);
        class1.addStudent(s2);
        class2.addStudent(s3);

        // Adding students, teachers, and classes to the school
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addClass(class1);
        school.addClass(class2);

        // Displaying school information
        System.out.println("Total Students: " + school.getStudents().size());
        System.out.println("Total Teachers: " + school.getTeachers().size());
        System.out.println("Total Classes: " + school.getClasses().size());

        // Displaying class details
        for (SchoolClass sc : school.getClasses()) {
            System.out.println("\nClass: " + sc.getClassName());
            System.out.println("Teacher: " + sc.getTeacher().getName());
            System.out.println("Number of Students: " + sc.getStudents().size());
        }

        // Removing a student, a teacher, and a class
        school.removeStudent("x");
        school.removeTeacher("B");
        school.removeClass("English Class");

        // Displaying updated school information
        System.out.println("\nAfter Removal:");
        System.out.println("Total Students: " + school.getStudents().size());
        System.out.println("Total Teachers: " + school.getTeachers().size());
        System.out.println("Total Classes: " + school.getClasses().size());
    }
}