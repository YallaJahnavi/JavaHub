class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        
        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
