package daily_practice.leetcode;

public class Solution27 {
    public static void main(String[] args) {
        int val=3;
        int[] nums=new int[]{3,3,2,2};
        removeElement(nums,val);
    }
    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        int k=0;
        int[] remove=new int[1000];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                len--;
            }
            else {
                nums[k++]=nums[i];
//                remove[k++]=nums[i];
            }
        }
//        for (int i = 0; i < remove.length; i++) {
//            nums[i]=remove[i];
//        }
        return len;
    }
}
