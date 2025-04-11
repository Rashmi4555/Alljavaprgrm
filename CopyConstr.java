class Student {
    String name;
    int age;
    String course;
    Student() {
        this("Unknown", 0, "Not enrolled"); 
        System.out.println("No-argument constructor called.");
    }
    Student(String name) {
        this(name, 0, "Not enrolled"); 
        System.out.println("One-argument constructor called.");
    }
    Student(String name, int age) {
        this(name, age, "Not enrolled"); 
        System.out.println("Two-argument constructor called.");
    }
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-argument constructor called.");
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class CopyConstr {
    public static void main(String[] args) {
        System.out.println("Creating student1 using no-argument constructor:");
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println("\nCreating student2 using one-argument constructor:");
        Student student2 = new Student("Alice");
        student2.displayDetails();

        System.out.println("\nCreating student3 using two-argument constructor:");
        Student student3 = new Student("Bob", 22);
        student3.displayDetails();

        System.out.println("\nCreating student4 using three-argument constructor:");
        Student student4 = new Student("Charlie", 25, "Computer Science");
        student4.displayDetails();
    }
}
