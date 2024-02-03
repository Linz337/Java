package daily_practice.HackerRank;

import java.util.Scanner;

public class substring_compare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int len=scan.nextInt();

        String small=str.substring(0,len);
        String large=str.substring(0,len);
        for (int i = 1; i < str.length()-len+1; i++) {
            String str2=str.substring(i,i+len);
            if (str2.compareTo(small)<0){
                small=str2;
            }
            else {
                if (large.compareTo(str2)<0){
                    large=str2;
                }
            }

//            int temp1=compare(small,str2,len);
//            int temp2=compare(str2,large,len);
//            if(temp1==-1||temp2==-1){
//                throw new IllegalArgumentException("Error");
//            }
//            else if (temp1==1){
//                if(temp2==1) {
//                    continue;
//                }
//                else {
//                    large=str2;
//                }
//            }
//            else {
//                small=str2;
//            }
        }
        System.out.println(small+"\n"+large);
    }
//    static int compare(String str1, String str2, int k){
//        for (int i = 0; i < k; i++) {
//            char s1=str1.charAt(i);
//            char s2=str2.charAt(i);
//            if (s1>='A'&&s1<='Z'&&s2>='a'&&s2<='z'){
//                return 1;
//            }
//            else if(s2>='A'&&s2<='Z'&&s1>='a'&&s1<='z'){
//                return 2;
//            }
//
//            if (s1<s2){
//                return 1;
//            }
//            else if (s1==s2) {
//                continue;
//            }
//            else {
//                return 2;
//            }
//        }
//        return -1;
//    }
}
