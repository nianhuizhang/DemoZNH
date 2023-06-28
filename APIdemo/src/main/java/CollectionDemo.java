import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        int size;
        boolean b;
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("e");
        System.out.println("----ArrayList----");
        System.out.println(list1);
        list1.remove("a");
        System.out.println("----ArrayList.remove----");
        System.out.println(list1);
        System.out.println("---ArrayList.size---");
        size = list1.size();
        System.out.println(size);
        System.out.println("---ArrayList.isEmpty()");
        b=list1.isEmpty();
        System.out.println(b);
        System.out.println("---Arraylist.iterator");
           //list1.iterator().;
        Iterator it = list1.iterator();
        while(it.hasNext())
        {
           // Object str = it.next();
            String str = (String) it.next();
            System.out.println(str);
        }
        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("e");
        list2.remove("e");
        System.out.println("---Linklist---");
        System.out.println(list2);

        System.out.println("--------Set--------");
        Set<String> set = new HashSet<>();
        set.add("q");
        set.add("w");
        set.add("e");
        set.add("r");
        set.add("t");
        set.add("y");
        set.add("y");
        set.add("y");
        set.add("y");
        System.out.println(set);
        System.out.println("----equls");
        System.out.println(set.equals("q"));
        System.out.println("----clear---");
        //set.clear();
        System.out.println(set);
        Iterator<String> its = set.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }
        System.out.println("-----Map-----");
        Map<String,String> map= new HashMap<>();
        map.put("1","可乐");
        map.put("2","牛奶");
        map.put("3","奶茶");
        System.out.println(map);
        System.out.println("----containsKey---");
        System.out.println(map.containsKey("1"));
        System.out.println("---containsValue---");
        System.out.println(map.containsValue("可乐"));
        System.out.println("---get---");
        System.out.println(map.get("1"));
        System.out.println("---keySet---");
        System.out.println(map.keySet());
        System.out.println("---values---");
        System.out.println(map.values());
        System.out.println("-------treeset-----");
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(232);
        treeset.add(1);
        treeset.add(1324);
        treeset.add(13);
        treeset.add(123);
        System.out.println(treeset);

    }





}
