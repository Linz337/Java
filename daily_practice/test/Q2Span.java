package daily_practice.test;

import java.util.List;
import java.util.ArrayList;

/**
 * A _Span_ represents a segment of a sequence, defined by its start and
 * end index. A span can also have a set of contained subspans. This
 * structure is used, e.g., in parsing natural language. For example,
 * the grouping of words in the following sentence
 * <p>
 *
 * [[[The man] who [works] [there]] [tells] [the people] [to [get] [out]]]
 * <p>
 *
 * can be represented by the spans
 * <p>
 *
 * 0-10 with subspans [
 *   0-4 with subspans [
 *     0-1 with subspans [],
 *     3-3 with subspans [],
 *     4-4 with subspans []
 *   ],
 *   5-5 with subspans [],
 *   6-7 with subspans [],
 *   8-10 with subspans [
 *     9-9 with subspans [],
 *     10-10 with subspans []
 *   ],
 * ]
 *
 */
public class Q2Span {
    int start;
    int end;
    List<Q2Span> contained;

    public Q2Span(int start, int end, List<Q2Span> contained) {
        this.start = start;
        this.end = end;
        this.contained = new ArrayList<>(contained);
    }

    public Q2Span(int start, int end) {
        this.start = start;
        this.end = end;
        this.contained = new ArrayList<>();
    }

    /**
     * A span is valid iff (a) its end index is not less than its start
     * index; (b) all of its subspans are contined with it (i.e., every
     * subspan's start and end indices are non-strictly between the
     * containing span's start and end indices; and (c) all its subspans
     * are valid.
     *
     * @return true if this span is valid, false otherwise.
     */
    public boolean isValid() {
        if (end<start){
            return false;
        }
        if (contained==null||contained.size()==0){
            return true;
        }
        //        List<Q2Span> sub = new ArrayList<>();
        //        sub=contained.subList(1,contained.size()-1);

        contained.remove(contained.size()-1);
        contained.remove(0);


        if (contained.contains('[')){
            for (int i=contained.get('[').start;i<contained.size();i++) {
                Q2Span sub = null;
                sub.contained.add(contained.get(i));
                if (contained.get(i).equals(']')) {
                    sub.start=contained.get('[').start+1;
                    sub.end=contained.get(']').end+1;
                    sub.isValid();
                }
            }
        }

        // FIXME: implement this method
        return true;
    }

    public String toString() {
        return "Span(" + start + ", " + end + ", " + contained + ")";
    }

}