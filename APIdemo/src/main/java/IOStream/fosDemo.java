package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class fosDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fops = new FileOutputStream("d:\\Java\\APIdemo\\a.txt");
        fops.write(111);
        fops.write(97);
        fops.write(95);
        fops.write(98);fops.write(99);
        fops.write(100);


        fops.close();




    }
}
