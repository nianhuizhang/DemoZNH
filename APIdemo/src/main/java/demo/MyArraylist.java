package demo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraylist {

    public static void main(String[] args) {
//Arrays.tostring;
        int [] array ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("array:");
        System.out.println(Arrays.toString(array));
        System.out.println("二分查找");
        System.out.println(Arrays.binarySearch(array,3));
        System.out.println(Arrays.binarySearch(array,4));
        int [] array1;
        array1 = Arrays.copyOf(array,5);
        System.out.println(Arrays.toString(array1));
        int [] array2 = Arrays.copyOfRange(array,2,5);
        System.out.println("`--- array2---");
        System.out.println(Arrays.toString(array2));
        int [] array3 = Arrays.copyOf(array,10);
        Arrays.fill(array3,100);
        System.out.println("----array3----");
        System.out.println(Arrays.toString(array3));
        int [] array4 = {23,42,253,234,2222,44,1,2,2,7,4,3,2};
        Arrays.sort(array4);
        System.out.println("----array4----");
        System.out.println(Arrays.toString(array4));
        Integer [] arr = {435,432,32,55,76,43,22,77,55,22};
        System.out.println("----sort----");
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }



}
