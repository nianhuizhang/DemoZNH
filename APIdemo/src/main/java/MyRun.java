public class MyRun implements Runnable {
    public void run(){

        for(int i = 0 ;i<100;i++){
            Thread t = Thread.currentThread();


            System.out.println(t.getName()+"haha"+i);

        }


    }
}
