package ticket;

import thread.Mythread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Ticket extends Thread {
    static Lock lock = new ReentrantLock();

     static int ticket = 0;
     static Object obj = new Object();
    public Ticket() {
        super();
    }
    public Ticket(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true){
           // synchronized (Mythread.class){
            lock.lock();
            try {
                if(ticket==100)
                {
                    break;
                }
                else{

                    Thread.sleep(300);
                    ticket++;
                    System.out.println(getName()+ticket);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }





       // }



    }
}
