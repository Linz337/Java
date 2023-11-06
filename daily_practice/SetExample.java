package daily_practice;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // 创建一个HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // 转换成数组
        String[] arrayFromHashSet = hashSet.toArray(new String[0]);
        System.out.println("HashSet as an array: " + Arrays.toString(arrayFromHashSet));

        // 转换成ArrayList
        List<String> listFromHashSet = new ArrayList<>(hashSet);
        System.out.println("HashSet as a List: " + listFromHashSet);

        // 创建一个TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Grape");
        treeSet.add("Cherry");

        // 转换成Map
        Map<Integer, String> mapFromTreeSet = new LinkedHashMap<>();
        int index = 0;
        for (String element : treeSet) {
            mapFromTreeSet.put(index, element);
            index++;
        }
        System.out.println("TreeSet as a Map: " + mapFromTreeSet);

        // 常用Set方法
        System.out.println("HashSet contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("HashSet size: " + hashSet.size());
        System.out.println("TreeSet size: " + treeSet.size());

        // 循环遍历HashSet (for-each)
        System.out.println("HashSet elements (for-each):");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // 使用迭代器遍历TreeSet
        System.out.println("TreeSet elements (using iterator):");
        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }

        // 移除元素
        hashSet.remove("Banana");

        // 检查Set是否为空
        boolean isHashSetEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isHashSetEmpty);
    }
}

