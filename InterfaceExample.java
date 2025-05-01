interface Animal1 {
    void makeSound();
}
class Dog implements Animal1 {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal1 myDog = new Dog();
        myDog.makeSound();
    }
}


