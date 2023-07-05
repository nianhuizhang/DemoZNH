package webDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipdemo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inet1 = InetAddress.getByName("192.168.80.1");
        System.out.println(inet1);
        String hostname = inet1.getHostName();
        System.out.println(hostname);
        String hostip = inet1.getHostAddress();
        System.out.println(hostip);
    }
}
