package questionthread3;

public class OddDemo {
    public static void main(String[] args) {
        OutputOdd outputOdd1 = new OutputOdd("线程一");
        OutputOdd outputOdd2 = new OutputOdd("线程二");
        outputOdd1.start();
        outputOdd2.start();


    }
}
