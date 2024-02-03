package daily_practice.HackerRank;

import java.util.Scanner;

//Input Format
//
// There are two lines of input.
// The first line contains B: the breadth of the parallelogram.
// The next line contains H: the height of the parallelogram.
//
// Constraints
//
// Output Format
// If both values are greater than zero, then the main method must output the area of the parallelogram.
// Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
public class static_practice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int B = scanner.nextInt();
        if (B<=0||H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(B*H);
        }
    }
}