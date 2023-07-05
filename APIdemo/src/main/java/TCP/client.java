package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {

    public static void main(String[] args) throws IOException {

        Socket cs = new Socket("127.0.0.1",10086);
        OutputStream ops = cs.getOutputStream();
        ops.write("wefweftrwetrew冯绍峰色粉色粉色wef".getBytes());
        ops.close();
        cs.close();

    }
}
