package IOStream;

import java.io.*;

public class StreamCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("d://Java//APIdemo//a.txt");
        FileOutputStream output = new FileOutputStream("d://Java//APIdemo//b.txt");
//        int s;
//        while(( s =input.read())!=-1){
//            output.write(s);
//        }
//        input.close();
//        output.close();
        System.out.println("++++++++++++++++++++++++++++++");
        byte[] ch = new byte[2];
        int len = input.read(ch);
        String str = new String(ch,0,len);
        System.out.println("长度："+len+"内容："+str);
        int len1 = input.read(ch);
        String str1 = new String(ch,0,len1);
        System.out.println("长度："+len+"内容："+str1);
        int len2 = input.read(ch);
        String str2 = new String(ch,0,len2);
        System.out.println("长度："+len+"内容："+str2);
        int len3 = input.read(ch);
        String str3 = new String(ch,0,len3);
        System.out.println("长度："+len3+"内容："+str3);
        System.out.println("编码，解码形式   ");
        String str11 = "cocl啊额";
        byte[] bytes = str11.getBytes();
        System.out.println(bytes);
        String str22 = new String(bytes);
        System.out.println(str22);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        FileReader fr = new FileReader("d:\\Java\\APIdemo\\a.txt");
//        int temp;
//        while((temp=fr.read())!=-1){
//            System.out.println((char)temp);
//        }
        int len11;
        char[] bytes11 = new char[2];
        while((len11 = fr.read(bytes11))!=-1){
            System.out.print(new String(bytes11,0,len11));

        }
        fr.close();








    }
}
