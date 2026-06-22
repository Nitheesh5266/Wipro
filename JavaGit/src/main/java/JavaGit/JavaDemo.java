package JavaGit;

// OOP Class
class Student {
    // Encapsulation (private variables)
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Main class
public class JavaDemo {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student("Nitheesh", 23);

        // Calling method
        s1.displayDetails();
    }
}
