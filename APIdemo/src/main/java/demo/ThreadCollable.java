package demo;

import demo.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCollable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable callable = new MyCallable();
        FutureTask<Integer> task = new FutureTask(callable);
        Thread t = new Thread(task);
        t.start();
        Integer res = task.get();
        System.out.println(res);





    }
}
