package daily_practice;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 创建一个新的LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 添加元素到LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // 获取LinkedList的大小
        int size = linkedList.size();
        System.out.println("Size: " + size);

        // 遍历LinkedList并打印每个元素
        System.out.println("Elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 获取第一个元素
        String firstElement = linkedList.getFirst();
        System.out.println("First Element: " + firstElement);

        // 获取最后一个元素
        String lastElement = linkedList.getLast();
        System.out.println("Last Element: " + lastElement);

        // 移除指定元素
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);

        // 检查LinkedList是否包含指定元素
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("Contains 'Cherry': " + containsCherry);

        // 清空LinkedList
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);

        // 检查LinkedList是否为空
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 转换为数组
        String[] array = new String[linkedList.size()];
        linkedList.toArray(array);

        // 打印数组元素
        for (String item : array) {
            System.out.println(item);
        }

        // 转换为Map
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < linkedList.size(); i++) {
            map.put(i, linkedList.get(i));
        }

        // 转换为Set
        Set<String> set = new HashSet<>(linkedList);
        // 打印Set
        set.forEach(System.out::println);
    }
}
