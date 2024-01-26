package daily_practice.leetcode;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String output = new String();
        int flag = 0;
        if (strs == null) {
            return "";
        }
        else if (strs.length == 1) {
            output += strs[0];
        }
        else {
            int minlength = 10000;
            int minlo=0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i]==null||strs[i].isEmpty()){
                    return "";
                }
                if (strs[i].length() <= minlength) {
                    minlength = strs[i].length();
                    minlo = i;
                }
            }
            int length = 0;
            for (int j = 0; j < minlength; j++) {
                for (int i1 = 0; i1 < strs.length; i1++) {
                    if (i1 == minlo) {
                        continue;
                    }
                    if (strs[minlo].charAt(j) != strs[i1].charAt(j)) {
                        j=j-1;
                        flag=1;
                        break;
                    }
                }
                length=j;
                if (flag==1){
                    break;
                }
            }
            output= (String) strs[minlo].subSequence(0,length+1);
        }
        return output;
    }
}
