package IOStream;

import java.io.*;

public class BufferIOCopy {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\Java\\APIdemo\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\Java\\APIdemo\\copy1.txt"));
        //char[] chars = new char[2];
//        int b;
//        while((b=bis.read())!=-1){
//            bos.write(b);
//        }
//        bis.close();
//        bos.close();

        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){

            bos.write(bytes,0,len);

        }
        bis.close();
        bos.close();


    }
}
