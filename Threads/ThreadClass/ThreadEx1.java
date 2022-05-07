package Threads.ThreadClass;

public class ThreadEx1 extends Thread{
    public void run(){
        System.out.println("My thread is in running state.");
    }

    public static void main(String args[]){
        ThreadEx1 obj=new ThreadEx1();
        obj.start();
    }
}
