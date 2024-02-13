package daily_practice.HackerRank;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        int Q=scan.nextInt();
        if (Q!=0) {
            String[] str = new String[10000];
            for (int i = 0; i < Q; i++) {
                scan.nextLine();
                str[i] = scan.nextLine();
                int order =scan.nextInt();
                if (str[i].equals("Insert")) {
                    int num = scan.nextInt();
                    list.add(order, num);
                } else if (str[i].equals("Delete")) {
                    list.remove(order);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
