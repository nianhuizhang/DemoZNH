package demo1;

public class foodeat extends Thread {

    @Override
    public void run() {

        synchronized(Desk.lock){
            while(true){
                if(Desk.foodFlag ==0){

                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                }

            }
                else{
                Desk.count--;
                System.out.println("吃货在吃面条，还能在吃"+Desk.count+"碗");
                Desk.lock.notifyAll();
                Desk.foodFlag  = 0;

                }





            }



        }




    }
}
