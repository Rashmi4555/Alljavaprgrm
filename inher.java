class inher{
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends inher {
    void bark() {
        System.out.println("barking");
    }
}
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); 

        myDog.eat();  
        myDog.bark();
    }
}
