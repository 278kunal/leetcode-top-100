class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int maxSumUptoI=nums[0];
        for(int i=1;i<nums.length;i++) {
            maxSumUptoI=Math.max(nums[i],maxSumUptoI+nums[i]);
            maxSum=Math.max(maxSum,maxSumUptoI);
        }
        return maxSum;
    }
}