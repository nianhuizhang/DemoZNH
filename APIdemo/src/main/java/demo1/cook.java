package demo1;

public class cook extends Thread{

    @Override
    public void run() {

        synchronized (Desk.lock){
            while(true){
                if(Desk.count==0)
                {
                    break;
                }
                else
                {
                    if(Desk.foodFlag==1)
                    {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        Desk.foodFlag=1;
                        System.out.println("念辉做了一碗面条");
                        Desk.lock.notifyAll();
                    }
                }




            }





        }


    }
}
