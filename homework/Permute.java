package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();

        if(compare(str1,str2))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean compare(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);

    }
}
