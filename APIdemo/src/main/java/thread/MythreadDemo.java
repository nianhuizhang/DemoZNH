package thread;

public class MythreadDemo {
    public static void main(String[] args) throws InterruptedException {

//        Mythread t1 = new Mythread("飞机");
//        Mythread t2 = new Mythread("坦克");
//        t1.setPriority(1);
//        t2.setPriority(2);
//        t1.start();
//        t2.start();
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
        Mythread t1 = new Mythread("主");
      //  Mythread1 t2 = new Mythread1("从");
        //t2.setDaemon(true);
        t1.start();
       // t2.start();



        t1.join();

        for(int i = 0;i<100;i++){
            System.out.println(i);
        }



    }
}
