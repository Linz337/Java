package daily_practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            isPrime(i);
        }

    }

    public static boolean isPrime(int num) {
        for (int k = 2; k < num; k++) {
            if (num % k == 0) {
                return false;
            }
        }
        System.out.println(num);
        return true;
    }
}
