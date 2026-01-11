
// Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {

    @Override
    public void run() {
        // Code executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class PS_58_ThreadRnStr {
    public static void main(String[] args) {
        // Create Runnable object
        MyRunnable r = new MyRunnable();

        // Create Thread using Runnable and name
        Thread t1 = new Thread(r, "Thread-A");
        Thread t2 = new Thread(r, "Thread-B");

        // Start threads
        t1.start();
        t2.start();        
    }
}
