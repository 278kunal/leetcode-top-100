class Solution {
    public int search(int[] nums, int target) {
        if(nums.length ==0 )
            return -1;
        int low=0;
        int high=nums.length -1;
        while(low<high) {
            int mid=(low+high)/2;
            if(nums[mid]<nums[high])
                high=mid;
            else if(nums[mid]>nums[high])
                low=mid+1;     
        }
        int minIndex=high;
         high=nums.length-1;
        if(nums[minIndex]==target)
            return minIndex;
        if(minIndex==0 || minIndex==nums.length-1) //already sorted array
            return binSearch(nums,target,0,
                             minIndex==0?nums.length-1: nums.length-2);
        
            if(target>=nums[0] && target<=nums[minIndex-1])
            return binSearch(nums,target,0,minIndex-1);
        else
            return binSearch(nums,target,minIndex+1,nums.length-1);
        
        
    }
    int binSearch(int arr[], int target,int low, int high){
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}