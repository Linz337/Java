package homework;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Scanner in2 = new Scanner(System.in);
        int length = in.nextInt();
        int movielength[] = new int[1000];

        movielength[0] = length / 60;
        movielength[1] = length % 60;

        if (movielength[0] < 1) {
            System.out.print(str + " runs for ");
            mins(movielength[1]);
        } else if (movielength[0] == 1) {
            System.out.print(str + " runs for " + movielength[0] + " hour");
            and(movielength[1]);
            mins(movielength[1]);
        } else {
            System.out.print(str + " runs for " + movielength[0] + " hours");
            and(movielength[1]);
            mins(movielength[1]);
        }
        System.out.println();
    }

    public static void mins(int k) {
        if(k==0){
            return;
        }
        else if(k==1){
            System.out.print(k+" minute");
        }
        else{
            System.out.print(k+" minutes");
        }
    }
    public static void and(int p){
        if(p!=0)
        {
            System.out.print(" and ");
        }
    }
}
