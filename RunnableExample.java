class MyRunnable implements Runnable {
    public void run() //running the thread
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread Running: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable(); //implementing the runnable interface
        Thread t1 = new Thread(obj); // creating a thread and Passing the Runnable instance to Thread
        t1.start(); //starting the thread execution
    }
}
