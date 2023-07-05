package thread;

public class Mythread extends Thread{

    public Mythread() {
        super();
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for(int i=0;i<100;i++)
        {
            System.out.println(getName()+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            Thread.yield();

        }

    }
}
