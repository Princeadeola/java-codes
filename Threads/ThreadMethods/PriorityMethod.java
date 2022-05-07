package Threads.ThreadMethods;

public class PriorityMethod implements Runnable {
    Thread thread;

    PriorityMethod(int priority) {
        thread = new Thread(this, "ChildThread");
        thread.setPriority(priority);
        System.out.println("Thread created: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(thread + " loop : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread : " + thread + " interrupted");
        }
    }
}