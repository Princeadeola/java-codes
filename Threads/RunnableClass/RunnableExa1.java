package Threads.RunnableClass;

public class RunnableExa1 implements Runnable{
    public void run(){
        System.out.println("My thread is in running state.");
        run2();
    }

    public void run2(){
        System.out.println("My thread is in second running state.");
    }

    public static void main(String args[]){
        RunnableExa1 obj=new RunnableExa1();
        Thread obj1 =new Thread(obj);
        obj1.start();
    }
}