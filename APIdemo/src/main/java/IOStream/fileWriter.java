package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\Java\\APIdemo\\a.txt");
        fw.write(25555);//UTF-8


        fw.write("你好啊啊啊啊deaf违法");
        fw.close();


    }

}
