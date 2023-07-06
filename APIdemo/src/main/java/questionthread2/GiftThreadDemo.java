package questionthread2;

public class GiftThreadDemo {
    public static void main(String[] args) {
        Gift gift1 = new Gift("小明");
        Gift gift2 = new Gift("小红");
        gift1.start();
        gift2.start();



    }
}
