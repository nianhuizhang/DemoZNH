package demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class cook1 extends Thread{
    ArrayBlockingQueue arrayBlockingQueue;

    public cook1(ArrayBlockingQueue arrayBlockingQueue){
        this.arrayBlockingQueue = arrayBlockingQueue;

    }
    @Override
    public void run() {

        while(true){
            try {
                arrayBlockingQueue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }





    }
}
