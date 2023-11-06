package daily_practice;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HashSEtDemo {
 public static void main(String[] args) {
        // 创建一个HashSet并添加元素
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // 常用Set方法
        System.out.println("Set contains 'A': " + set.contains("A"));
        System.out.println("Set size: " + set.size());

        // 循环遍历Set (for-each)
        System.out.println("Set elements (for-each):");
        for (String element : set) {
            System.out.println(element);
        }

        // 转换为数组
        String[] array = set.toArray(new String[0]);
        System.out.println("Set to Array:");
        for (String element : array) {
            System.out.println(element);
        }

        // 转换为List
        List<String> list = new ArrayList<>(set);
        System.out.println("Set to List:");
        for (String element : list) {
            System.out.println(element);
        }

        // 使用迭代器遍历Set
        Iterator<String> iterator = set.iterator();
        System.out.println("Set elements (using iterator):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 转换为Map
        Map<String, String> map = new HashMap<>();
        for (String element : set) {
            map.put(element, element); // 这里将元素作为键和值
        }
        System.out.println("Set to Map:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
