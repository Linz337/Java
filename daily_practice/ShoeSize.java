package daily_practice;

import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double height=in.nextDouble();
        System.out.println(Math.round(height*5.0));
    }
}
