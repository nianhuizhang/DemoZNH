package demo1;

public class producerConsummerDemo {
    public static void main(String[] args) {
        foodeat f1 = new foodeat();
        cook c1 = new cook();

        c1.start();
        f1.start();

    }
}
