package daily_practice;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // 创建一个HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");

        // 转换成Set
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println("HashMap as an Entry Set: " + entrySet);

        // 转换成List
        List<String> valuesAsList = new ArrayList<>(hashMap.values());
        System.out.println("HashMap values as a List: " + valuesAsList);

        // 创建一个TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(3, "Cherry");

        // 转换成数组
        Integer[] keysAsArray = treeMap.keySet().toArray(new Integer[0]);
        System.out.println("TreeMap keys as an array: " + Arrays.toString(keysAsArray));

        // 常用Map方法
        System.out.println("HashMap contains key 2: " + hashMap.containsKey(2));
        System.out.println("TreeMap size: " + treeMap.size());

        // 循环遍历HashMap (for-each)
        System.out.println("HashMap elements (for-each):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 使用迭代器遍历TreeMap
        System.out.println("TreeMap elements (using iterator):");
        Iterator<Integer> treeMapIterator = treeMap.keySet().iterator();
        while (treeMapIterator.hasNext()) {
            Integer key = treeMapIterator.next();
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // 移除元素
        hashMap.remove(2);

        // 检查Map是否为空
        boolean isHashMapEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isHashMapEmpty);
    }
}
