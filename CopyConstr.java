class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstr {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(person1);
        System.out.println("Person 1: ");
        person1.displayInfo();
        
        System.out.println("Person 2 (copy of Person 1): ");
        person2.displayInfo();
    }
}
