package thread;

public class Mythread1 extends Thread {
    public Mythread1() {
        super();
    }

    public Mythread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){

            System.out.println(getName()+i);
        }
    }
}
