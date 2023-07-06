package demo;

import java.io.File;

public class MyFile {
    String str = "c\\user\\colo\\text.txt";


    File file = new File(str);
    String parent = "c\\user\\colo";
    String child = "text.txt";
    File file1 = new File(parent,child);

    

}
