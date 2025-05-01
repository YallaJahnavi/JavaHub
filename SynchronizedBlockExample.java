class SharedResource2 {
    void printNumbers(int n) {
        // Non-critical section (Not synchronized, multiple threads can execute this)
        System.out.println(Thread.currentThread().getName() + " is starting.");

        // Synchronized block (Only one thread can execute this block at a time)
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + (n * i));
                try { Thread.sleep(500); } catch (InterruptedException e) { }
            }
        }

        // Non-critical section (Not synchronized)
        System.out.println(Thread.currentThread().getName() + " is done.");
    }
}

class ThreadA extends Thread {
    SharedResource2 resource;
    ThreadA(SharedResource2 resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers(5);
    }
}

class ThreadB extends Thread {
    SharedResource2 resource;
    ThreadB(SharedResource2 resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers(7);
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        SharedResource2 obj = new SharedResource2(); // Shared object
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);
        
        t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t2.start();
    }
}
