package daily_practice;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Scanner in2=new Scanner(System.in);
        int time=in2.nextInt();

        System.out.print(str+" runs for ");
        if(time%60==0)
        {
            if(time/60==1)
            {
                System.out.println("1 hour");
            }
            else
            {
                System.out.println(time/60+" hours");
            }
        }
        else
        {
            if(time/60<1)
            {
                trans(time);
            }
            else if(time/60==1)
            {
                System.out.print(time/60+" hour and");
                trans(time%60);
            }
            else{
                System.out.print(time/60+" hours and ");
                trans(time%60);
            }
        }
    }
    public static void trans(int t){
        if(t==0){
            return;
        }
        else if(t==1)
        {
            System.out.println(t+" minute");
        }
        else
        {
            System.out.println(t+" minutes");
        }
    }
}
