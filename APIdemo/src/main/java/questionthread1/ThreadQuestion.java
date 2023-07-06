package questionthread1;

public class ThreadQuestion {
    public static void main(String[] args) {
        Window1 window1 = new Window1("窗口一");
        Window1 window2 = new Window1("窗口二");
        window1.start();
        window2.start();


    }
}
