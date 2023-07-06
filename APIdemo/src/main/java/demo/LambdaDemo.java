package demo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 32, 24, 3242, 23, 434, 32, 132, 565, 5643, 43, 321};
        System.out.println("----arr---");
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, (Integer o1, Integer o2)->{
//            return o1 - o2;
//        }
//        );
//        System.out.println("------o1-o2------");
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr, (Integer o1, Integer o2)->{
//                    return o2 - o1;
//                }
//        );
//        System.out.println("------o2-o1-----");

//        System.out.println(Arrays.toString(arr));
//
//lambda表达式
        method(()->{
                System.out.println("hahahaha");

            }
        );

    }







        public static void method(Swim s){s.swimming();


        }

      @FunctionalInterface
        interface Swim
        {
            public abstract void swimming();
        }




















    }

