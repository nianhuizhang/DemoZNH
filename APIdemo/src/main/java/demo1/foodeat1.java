package demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class foodeat1 extends Thread{

    ArrayBlockingQueue  arrayBlockingQueue;
    public foodeat1(ArrayBlockingQueue arrayBlockingQueue){
        this.arrayBlockingQueue = arrayBlockingQueue;

    }
    @Override
    public void run() {

        while(true){

            try {
                String food = (String)arrayBlockingQueue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        }
    }

