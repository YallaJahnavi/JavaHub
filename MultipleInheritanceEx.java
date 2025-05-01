interface Flyable {
    void fly();
}

interface Eatable {
    void eat();
}

class Bird implements Flyable, Eatable {
    public void fly() {
        System.out.println("Birds can fly.");
    }
    
    public void eat() {
        System.out.println("Birds eat seeds.");
    }
}

public class MultipleInheritanceEx {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.eat();
    }
}
