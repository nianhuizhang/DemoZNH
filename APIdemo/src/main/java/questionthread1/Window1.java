package questionthread1;
public class Window1 extends Thread{
    public static int ticket = 100;
    Object object = new Object();
    public Window1() {
    }
    public Window1(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true){
            synchronized (Object.class){
                if(ticket==0){
                    break;
                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(getName()+"卖出1张票还剩："+ticket+"张票");
                }
            }
        }
    }
}
