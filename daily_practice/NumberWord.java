package daily_practice;

import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Scanner in2=new Scanner(System.in);
        int i=in2.nextInt();
        System.out.println(i+", "+str);
    }
}
