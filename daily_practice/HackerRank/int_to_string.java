package daily_practice.HackerRank;

import java.util.Scanner;

//You are given an integer n, you have to convert it into a string.
// Please complete the partially completed code in the editor.
// If your code successfully converts n into a string s the code will print "Good job".
// Otherwise it will print "Wrong answer".
//
// can range between  to  inclusive.
public class int_to_string {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =new Scanner(System.in);
        int k=scan.nextInt();
        if (Integer.toString(k)!=null){
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}
