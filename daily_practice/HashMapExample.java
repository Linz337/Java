package daily_practice;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 72);

        // 将HashMap转换为List
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());

        // 将HashMap的键转换为Set
        Set<String> keySet = new HashSet<>(scores.keySet());

        // 将HashMap的值转换为List
        List<Integer> valueList = new ArrayList<>(scores.values());

        // 输出HashMap
        System.out.println("HashMap: " + scores);

        // 输出转换后的List和Set
        System.out.println("List of Entries: " + entryList);
        System.out.println("Set of Keys: " + keySet);
        System.out.println("List of Values: " + valueList);

        // 将HashMap的键转换为数组
        String[] keysArray = scores.keySet().toArray(new String[0]);

        // 将HashMap的值转换为数组
        Integer[] valuesArray = scores.values().toArray(new Integer[0]);

        // 将HashMap的键值对转换为数组
        Map.Entry<String, Integer>[] entryArray = scores.entrySet().toArray(new Map.Entry[0]);

        // 输出转换后的数组
        System.out.println("Keys Array: " + Arrays.toString(keysArray));
        System.out.println("Values Array: " + Arrays.toString(valuesArray));
        System.out.println("Entries Array: " + Arrays.toString(entryArray));
    }
}
