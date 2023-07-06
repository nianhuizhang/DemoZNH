package questionthread3;

public class OutputOdd extends Thread {
    public static int odd = 100;
    Object object = null;
    int key;

    public OutputOdd() {
    }
    public OutputOdd(String name) {
        super(name);
    }

    @Override
    public void run() {
            while (true){
                synchronized (Object.class){
                    if(odd<1){
                        break;
                    }
                    else{
                        key = odd;

                        if((judge(key))==true){
                            System.out.println(getName()+"输出的奇数值的："+odd);
                        }
                        odd--;

                    }
                }

            }

        }



    public boolean judge(int key){

        while(key>2){
            key = key/2;
        }
        if(key==1){
            return true;
        }else {
            return false;
        }

    };







}
