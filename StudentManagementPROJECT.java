import java.util.*;			//import the required package

class Student {				//data members
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {		//constructor to initialize the values
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override			//overridden a method to convert into string
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManagementPROJECT {
    static List<Student> studentList = new ArrayList<>();		//array list used to store the student records
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();	// method to add students into the list
                    break;
                case 2:
                    viewStudents();	// method to view all the students in the list
                    break;
                case 3:
                    updateStudent();	// method to update the student details in the list
                    break;
                case 4:
                    deleteStudent();	// method to delete the student from the list
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Create (Add) Student
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        studentList.add(new Student(id, name, age));
        System.out.println("Student added successfully!");
    }

    // Read (View) Students
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    // Update Student
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        for (Student s : studentList) {
            if (s.id == id) {
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new Name: ");
                s.name = scanner.nextLine();
                System.out.print("Enter new Age: ");
                s.age = scanner.nextInt();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().id == id) {
                iterator.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
