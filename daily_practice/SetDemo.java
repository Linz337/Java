package daily_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();

        s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");

        System.out.println(s);

        System.out.println("\nIterator----");
        Iterator<String> it= s.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        System.out.println("\nfor------");
        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println("\n匿名内部类----");
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str2) {
                System.out.println(str2);
            }
        });

        System.out.println("\nlambda-----");
        s.forEach(str2-> System.out.println(str2));
    }
}
