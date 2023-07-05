package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class fisDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\Java\\APIdemo\\a.txt");
        int s ;
        while(( s= fis.read())!=-1)
        {System.out.print((char)s);}

    }

}
