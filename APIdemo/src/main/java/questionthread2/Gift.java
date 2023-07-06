package questionthread2;

public class Gift extends Thread {
    public Gift() {
    }
    public Gift(String name) {
        super(name);
    }
    Object object = null;
    public static int GiftNum = 100;

    @Override
    public void run() {
        while(true){
            synchronized (Object.class){
                if(GiftNum<10)
                {
                    break;

                }else{
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    GiftNum--;
                    System.out.println(getName()+"送出一份礼物，剩余的礼物数量为："+GiftNum);

                }
            }

        }
    }
}
