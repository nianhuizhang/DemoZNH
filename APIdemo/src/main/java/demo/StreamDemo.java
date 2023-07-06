package demo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张三-11");
        list.add("李四-12");
        list.add("王五-13");
        list.add("张念辉-14");
        list.add("张三丰-15");
        list.add("李红-16");
        System.out.println("----总的人名---");
        System.out.println(list);
        for(String name :list){
            if(name.startsWith("张"))
            {
                list1.add(name);
            }
        }
        System.out.println("----全是张的人-----");
        System.out.println(list1);
        System.out.println("-----张字为三个字的人----");
        for(String name : list1){
            if(name.length()==3)
            {
                list2.add(name);

            }

        }
        System.out.println(list2);
        //System.out.println("-----Stream流-----");
        //list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name->System.out.println(name));
        System.out.println("--------流真正的使用---------");
        System.out.println("----匿名内部类---");
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"a","b","c","d");
        Stream<String> stream1 = list4.stream();
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        System.out.println("----Lambda表达式----");
        System.out.println("----单列集合----");
        stream1.forEach(s -> System.out.println(s));
        System.out.println("----双列集合----");
        HashMap<String,String> map = new HashMap<>();
        map.put("1","可乐");
        map.put("2","naicha");
        map.put("3","yinliao");
       // map.keySet().stream().forEach(s->System.out.println(s));
        map.entrySet().stream().forEach(s->System.out.println(s));
        System.out.println("-----数组流-----");
        int[] arr = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr).forEach(s->System.out.println(s));
        System.out.println("-------------------String--------------");
        String[] str = {"a","b","c"};
        Arrays.stream(str).forEach(s -> System.out.println(s));
        Stream.of(1,2,3,4,5).forEach(s->System.out.println(s));
        Stream.of("1","2","3","4","5").forEach(s -> System.out.println(s));
        list4.stream().filter(s->s.startsWith("a")).forEach(s -> System.out.println(s));
        System.out.println("=============================================================");
        list4.stream().limit(3).forEach(s -> System.out.println(s));
        list4.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("+++");
        list.stream().limit(3).skip(2).forEach(s -> System.out.println(s));
        list4.add("aaa");
        list4.add("aaa");
        list4.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("===================================================");
        Stream.concat(list.stream(),list4.stream()).forEach(s -> System.out.println(s));
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
        int[] l = {1,2,3,4,5,6};
        String [] k = {"k","-","e","3","d"};
        String p ="21321-3213";
        p.split("-");
        System.out.println("111111111111111111");
        for(String i : p.split("-")){
            System.out.println(i);
        }
        //
        String[] key = p.split("-");
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        System.out.println(key[0]);

        List list5 = new ArrayList();
        list5.add("张三-11");
        list5.add("coco-12");
        list5.add("lala-13");
        list5.add("kk-14");
        list5.add("xiaxia-17");
        System.out.println(list5);

        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//        list5.stream().map(new Function<String,Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String StrAge = arr[1];
//                int age = Integer.parseInt(StrAge);
//                return age;
//            }
//        }).forEach(s->System.out.println(s));
        list.stream().map(s ->Integer.parseInt( s.split("-")[1])).forEach(s->System.out.println(s));
























    }
}
