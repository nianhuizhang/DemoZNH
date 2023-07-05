package thread;

public class MyRun implements Runnable{

    int ticket=0;

    @Override
    public void run() {
        while(true){
            if (method()) break;
        }
    }
    private synchronized boolean method() {

        if(ticket==100)
        {
            return true;

        }
        else{


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"卖出号："+ticket);




        }
        return false;
    }
}
