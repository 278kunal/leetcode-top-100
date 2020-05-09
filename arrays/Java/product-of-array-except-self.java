class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[] = new int[n];
        int prodFromLeft[] = new int[n];
        int prodFromRight[] = new int[n];
        prodFromLeft[0]=prodFromRight[n-1]=1;
        for(int i=1;i<n;i++)
            prodFromLeft[i]=prodFromLeft[i-1]*nums[i-1];
        for(int i=n-2;i>=0;i--)
            prodFromRight[i]=prodFromRight[i+1]*nums[i+1];
        for(int i=0;i<n;i++)
            result[i]=prodFromLeft[i]*prodFromRight[i];
        return result;
        
    }
}