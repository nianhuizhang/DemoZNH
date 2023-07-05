import java.util.ArrayList;
import java.util.Collections;

public class SpringAPIDemo {

    public static void main(String[] args) {


        StringBuffer buffer = new StringBuffer(10);
        StringBuilder builder = new StringBuilder(5);
        builder.append("可乐");
        builder.append("咖啡");
        builder.append("zzz");
        builder.append("dddd");
        System.out.println("-----builder----");
        System.out.println(builder);
        System.out.println("----insert----");
        builder.insert(2,"java");
        System.out.println(builder);
        builder.delete(2,3);
        System.out.println(builder);
        buffer.append("111");
        buffer.insert(2,"321");
        buffer.delete(2,3);







    }



}
