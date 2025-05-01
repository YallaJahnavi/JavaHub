class SharedResource {
    // Synchronized method (locks the whole method)
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + (n * i));
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class Thread11 extends Thread {
    SharedResource resource;
    Thread11(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers(2);
    }
}

class Thread22 extends Thread {
    SharedResource resource;
    Thread22(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers(3);
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource(); // Shared object
        Thread11 t1 = new Thread11(obj);
        Thread22 t2 = new Thread22(obj);
        
        t1.start();
        t2.start();
    }
}
