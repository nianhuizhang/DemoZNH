package webDemo;

import java.io.IOException;
import java.net.*;

public class  SendMessageDemo {


    public static void main(String[] args) throws IOException {

        DatagramSocket data1 = new DatagramSocket();
        String str = "helloword";
        byte[] bytes = str.getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,ip,port);
        data1.send(dp);
        data1.close();











//        DatagramSocket sd = new DatagramSocket();
//        String Info = "你好，兄弟";
//        byte[] bytes2 = Info.getBytes();
//        InetAddress address = InetAddress.getByName("127.0.0.1");
//        int port2 = 10001;
//        DatagramPacket dp1 = new DatagramPacket(bytes2,bytes2.length,address,port2);
//        sd.send(dp1);
//        sd.close();










    }
}
