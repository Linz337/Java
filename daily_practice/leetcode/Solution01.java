package daily_practice.leetcode;

public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int[] add=new int[2];
            add[0]=i;
            for(int j=i+1;j<nums.length;j++){
                add[1]=j;
                if (nums[i]+nums[j]==target){
                    return add;
                }
            }
        }
        return new int[0];
    }
}