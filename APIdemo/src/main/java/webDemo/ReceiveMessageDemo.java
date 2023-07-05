package webDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        bytes = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int len = dp.getLength();
        System.out.println("接收数据"+new String(bytes,0,len));
        System.out.println("接受的数据从"+address+"端口号："+port+"发送的");
        ds.close();



    }


}
