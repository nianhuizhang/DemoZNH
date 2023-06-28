public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        // 线程执行体
        for (int i = 0; i < 10; i++) {
            System.out.println("我是自定义" + Thread.currentThread().getName() + "--" + i);
        }
    }

    public static void main(String[] args) {
        // main线程，主线程

        // 创建线程实现类对象
        MyThread thread = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        // 调用start()方法启动线程
        thread.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("我是主线程--" + i);
        }
    }
}


















