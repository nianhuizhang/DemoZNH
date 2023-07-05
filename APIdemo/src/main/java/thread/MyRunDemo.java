package thread;

public class MyRunDemo {
    public static void main(String[] args) {
        MyRun run = new MyRun();

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.setName("窗口1号");
        t2.setName("窗口2号");
        t3.setName("窗口3号");
        t1.start();
        t2.start();
        t3.start();





    }
}
