package daily_practice.leetcode;

public class Solution09 {
    public boolean isPalindrome(int x) {
//        int i=0;
        int temp = 0;
        int number = x;
        int num[] = new int[1000];
        if (x < 0 || (x % 10 == 0 || x != 0)) {
            return false;
        } else if (x == 0 && x / 10 == 0) {
            return true;
        } else {
            while (x > 0) {
                temp = temp * 10 + x % 10;
                x = x / 10;
            }
            if (number != temp) {
                return false;
            }
            return true;

//            while (x>0){
//                num[i++]=x%10;
//                x=x/10;
//            }

//            if (i%2==0){
//                for (int k=0;k<(i/2);k++){
//                    if (judge(num,k,i)==false){
//                        return false;
//                    }
//                }
//            }
//            else {
//                for (int k=0;k<(i/2);k++){
//                    if (judge(num,k,i)==false){
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//    }
//    boolean judge(int num[],int k,int i){
//        if (num[k]!=num[i-k-1]){
//            return false;
//        }
//        return true;
        }
    }
}
