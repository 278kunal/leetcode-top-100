class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int dpZeroToNminusOne[]=new int[nums.length-1];
        int dpOneToN[]=new int[nums.length-1];
        dpZeroToNminusOne[0]=nums[0];
        dpZeroToNminusOne[1]=Math.max(nums[0],nums[1]);
        dpOneToN[0]=nums[1];
        dpOneToN[1]=Math.max(nums[1],nums[2]);
        for(int i=2;i<nums.length-1;i++){
            dpZeroToNminusOne[i]=Math.max(nums[i]+dpZeroToNminusOne[i-2],dpZeroToNminusOne[i-1]);
            dpOneToN[i]=Math.max(nums[i+1]+dpOneToN[i-2],dpOneToN[i-1]);
        }
        
        return Math.max(dpZeroToNminusOne[nums.length-2],dpOneToN[nums.length-2]);
        
    }
}