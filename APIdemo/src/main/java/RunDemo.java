public class RunDemo {
    public static void main(String[] args) {

        MyRun run1 = new MyRun();
        MyRun run2 = new MyRun();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();


    }
}
