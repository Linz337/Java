package math_homework;

public class m6005 {
    public static void main(String[] args) {
//        int num[]=  {0,4,5,7,2,9,5,2,0,6,3,1,7,3,2,9};
//        int num[] = {1,1,1,1,1,4,5,6,7,3,6,3,5,3,7,2};
//        int num[]=  {1,3,1,3,3,3,1,1,1,1,1,1,1,1,1,1};
        int num[] = {1,1,1,5,1,4,6,1,7,3,6,3,5,3,7,2};
//        System.out.println("num[3]:"+num[3]+"num[6]:"+num[6]+"num[7]:"+num[7]);
        int sum1,sum2;
        int mo = 0, k = 16, last = 15, mod = 17,t=4;
//        for (int x = 1; x < 16; x++) {
//        for (int x=5;x<15;x++){
//            num = new int[]{1, 1, 1, 1, 1, 4, 5, 6, 7, 3, 6, 3, 5, 3, 7, 2};
//            num[t]=num[t]+1;
//            num[3]=num[x];
//            num[x]=num[x+1];
//            num[x+1]=num[0];
//            System.out.println("x:"+x);
            sum1 = 0;
            sum2 = 0;
            for (int i = 1; i < k; i++) {
                sum1 = sum1 + i * num[i - 1];
            }
            mo = sum1 % mod;
            if (mo == num[last]) {
                sum2 = sum1 + k * num[last];
                if (sum2 % mod == 0) {
                    System.out.println("sum1:" + sum1 + "\n" + sum1 + "/" + mod + "=" + (sum1 - mo) / mod + "..." + mo);
                    System.out.println("sum2：" + sum2);
//                    System.out.println("num4:"+num[t]);
//                    System.out.println("num7:"+num[6]);
                } else {
                    System.out.println("error33");
                }
            } else {
                System.out.println("error");
            }
        }
//    }
}
    //        int num[]={0,4,5,7,2,9,5,2,0,6,3,1,7,3,2,9};
//        int num[]={2,0,1,0,0,0,0,0,0,0,0,0,7};
//    int num[]={0,2,7,9,0,9,5,2,0,6,2,1,7,3,2,4};
//    int sum1,sum2,t2;
//    int de=0;
//    int mo=0;
//    int p=1;
//    int q=11;
//    int k=16;
//    int last=15;
//    int mod=17;
////        for (mod=10;mod<26;mod++){
//
////            for (p=1;p<25;p++) {
////                for (q = 1; q < 26; q++) {
//                    sum1 = 0;
//                            sum2 = 0;
//                            t2 = 0;
//                            for (int i = 1; i < k; i++) {
//        sum1 = sum1 + i * num[i - 1];
//        if ((i - 1) % 2 == 1) {
//        t2 = t2 + q * num[i - 1];
//        } else {
//        t2 = t2 + p * (i - 1);
//        }
//
//        }
//
////            System.out.println("sum1 "+sum1);
//
////                    if (t2 % mod == 0) {
////                        System.out.println("p:  " + p);
////                        System.out.println("q:"+q);
////                        System.out.println("t2: " + t2);
////                    }
//        mo = sum1 % mod;
//
////                    if(mo==num[last]&& sum2%mod!=0) {
////                        System.out.println("warning: T1 wrong");
////                    }
//        if(mo==num[last]){
////                    System.out.println("==num[15]");
//
//        sum2 = sum1 + k * num[last];
//        t2 = t2 + p * num[last];
//        if (sum2 % mod == 0) {
//        System.out.println("sum1 " + sum1);
//        System.out.println("mod:" + mod);
//        System.out.println("dev:  " + (sum1 - mo) / mod);
//        System.out.println(mo);
//        System.out.println("sum2：" + sum2);
//        System.out.println("t2:  " + t2);
//        System.out.println("---------");
//        }
//        }
////                }
////            }
////        }
//
////        de=(sum-mo)/mod;
////        System.out.println("mod:    "+mo);
////        System.out.println("devide: "+de);