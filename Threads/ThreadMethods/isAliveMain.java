package Threads.ThreadMethods;

public class isAliveMain {
    public static void main(String[] args) {

        isAliveMethod obj = new isAliveMethod();
        System.out.println(obj.thread + " is alive ? : "
                + obj.thread.isAlive());

        try{
            for (int i = 1; i <= 7; i++) {
                System.out.println("Main Thread loop: " + i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
        System.out.println(obj.thread + " is alive? : " + obj.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}
