package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyReflectionDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class clazz = Class.forName("reflection.Student");
        System.out.println(clazz);
        Class clazz2 = Student.class;
        System.out.println(clazz==clazz2);
        Student student = new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz2==clazz3);
        System.out.println("=============================================================");
        Constructor[] con1 = clazz.getDeclaredConstructors();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int k:arr){
            System.out.println(k);
        }
        for(Constructor cons:con1){
            System.out.println(cons);
        }
        Constructor con2 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con2);
        System.out.println("======================");
        Constructor con3 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con3);
        Constructor con4 = clazz.getDeclaredConstructor(int.class,String.class);
        con4.setAccessible(true);
        System.out.println("--------------------------------------------------------------------");
        Student stu = (Student)con4.newInstance(20,"小明");
        System.out.println(stu);
        System.out.println("======================================");
        Field f1 = clazz.getDeclaredField("Name");
        System.out.println(f1);




    }
}
