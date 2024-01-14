package daily_practice.leetcode;

public class Solution13 {
    public int romanToInt(String s) {
        int sum=0,num=0;
        if (s.length()==1) {
            char Romannum=s.charAt(0);
            sum=partnum(Romannum);
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (i!=s.length()-1) {
                    if (partnum(s.charAt(i)) >= partnum(s.charAt(i + 1))) {
                        sum += partnum(s.charAt(i));
                    }
                    else {
                        sum-=partnum(s.charAt(i));
                    }
                }
                else {
                    sum+=partnum(s.charAt(i));
                }
            }

        }
        return sum;
    }
    int partnum(char character){
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Error: input wrong");
        }
    }
}