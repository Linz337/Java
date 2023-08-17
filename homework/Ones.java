package homework;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int count=Count(n);
        System.out.println(count);

    }
    public static int Count(int num)
    {
        int nums=0;
        while(num>0)
        {
            if(num%2==1)
            {
                nums++;
            }
            num=num/2;
        }
        return nums;
    }
}
