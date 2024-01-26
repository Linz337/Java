package daily_practice.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;

public class MergeSimilar {

    /**
     * Two values are similar if their absolute difference is <= 5.
     * For example, 1 and 5 are similar
     *              1 and -3 are similar
     *              1 and  6 are similar
     *              1 and  7 are NOT similar
     *
     * To merge a set of numbers [x0, x1, x2, ..., xn], we use the
     * average, calculated by the formula (x0 + x1 + x2 + ... + xn) / n.
     *
     * Note we use only integer addition and division,
     * i.e. do not cast anything to double.
     *
     * To merge a list, we only consider similarity in the _first_ pass
     * e.g. [1, 2, 7, 8] becomes [1, 7], NOT [5]
     *      [1, 6, 7, 8] becomes [3, 7], NOT [5]
     *
     * @param list The list of numbers sorted in ascending order.
     *        Note that the method _may_ modify this list.
     * @return The trimmed down list.
     */
    public static List<Integer> mergeSimilar(List<Integer> list) {
        // Note: This is not a correct implementation of the method.
        //
        // You may implement this method to help you validate your
        // unit test in Q5MergeSimilarTest. However, there are no marks
        // for implementing this method.
        Integer sum1=0,sum2=0;
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        List<Integer> newlist=new ArrayList<>();

        if (list==null||list.size()==0){
            return null;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        Integer first=list.get(0);
        temp1.add(first);
        for (int i=0;i<list.size();i++) {
            if (abs(list.get(i)-first)<=5){
                temp1.add(list.get(i));
            }
            else {
                for(int j=i;j<list.size();j++){
                    temp2.add(list.get(j));
                }
            }
        }
        for (Integer integer : temp1) {
            sum1 += integer;
        }
        for (Integer integer : temp2) {
            sum2 += integer;
        }
        int average1 = sum1 / temp1.size();
        int average2 = sum2 / temp2.size();
        newlist.add(average1);
        newlist.add(average2);

        return newlist;
    }

}