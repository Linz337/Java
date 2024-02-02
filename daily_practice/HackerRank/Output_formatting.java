package daily_practice.HackerRank;

import java.util.Scanner;

public class Output_formatting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);

        System.out.println("================================");
        for (int i=1;i<=3;i++) {
            String str=scan.next();
            int num=scan.nextInt();
            System.out.print(str);
            int k=15-str.length();
            while (k>0){
                System.out.print(" ");
                k--;
            }
            digit(num);
        }
        System.out.println("================================");
    }
    static void digit(int num){
        if(num>=100){
            System.out.println(num);
        }
        else if(num>=10&&num<100){
            System.out.println("0"+num);
        }
        else{
            System.out.println("00"+num);
        }
    }
}