package daily_practice;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // 创建一个ArrayList并添加元素
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 常用ArrayList方法
        System.out.println("ArrayList contains 'Apple': " + list.contains("Apple"));
        System.out.println("ArrayList size: " + list.size());

        // 循环遍历ArrayList (for-each)
        System.out.println("ArrayList elements (for-each):");
        for (String element : list) {
            System.out.println(element);
        }

        // 使用索引遍历ArrayList
        System.out.println("ArrayList elements (using index):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 使用迭代器遍历ArrayList
        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList elements (using iterator):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 增加更多元素
        list.add("Date");
        list.add("Elderberry");

        // 移除元素
        list.remove("Banana");

        // 替换元素
        list.set(2, "Grape");

        // 查找元素索引
        int index = list.indexOf("Grape");
        System.out.println("Index of 'Grape': " + index);

        // 检查ArrayList是否为空
        boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // 清空ArrayList
        list.clear();

        // 检查ArrayList是否为空
        boolean isEmptyAfterClear = list.isEmpty();
        System.out.println("Is ArrayList empty after clear? " + isEmptyAfterClear);
    }
}
