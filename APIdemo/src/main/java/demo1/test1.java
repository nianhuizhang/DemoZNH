package demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class test1 {
    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        cook1 c1 = new cook1(arrayBlockingQueue);
        foodeat1 f1 = new foodeat1(arrayBlockingQueue);

        c1.start();
        f1.start();
    }
}
