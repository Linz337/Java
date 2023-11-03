package daily_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iteration {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

//        coll.remove("lisi");
        //for
        System.out.println("\n-----for");
        for (String s:coll){
            System.out.println(s);
        }


        //Iterator
        System.out.println("\n-----Iterator");
        Iterator<String> s=coll.iterator();
        while (s.hasNext()){
            String str=s.next();
            System.out.println(str);
        }

        System.out.println("-----Iterator(add)");
        Iterator<String> m=coll.iterator();
        while (s.hasNext()){
            String str=s.next();
            if ("lisi".equals(str)){
                coll.add("qq");
            }
        }
        System.out.println(m);



        //匿名内部类
        System.out.println("\n-----");
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda
        System.out.println("\n-----lambda");
        coll.forEach(t-> System.out.println(t));
    }
}
