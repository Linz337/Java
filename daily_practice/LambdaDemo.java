package daily_practice;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] arr={"a","aaaa","aaa","aa"};

        //匿名内部类
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });

        //lambda
        Arrays.sort(arr,((o1, o2) -> o1.length()-o2.length()));

        System.out.println(Arrays.toString(arr));
    }
}
