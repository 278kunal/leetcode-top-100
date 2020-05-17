class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length -1;
        int areaMax=0;
        while(left<right) {
            areaMax=Math.max(areaMax,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return areaMax;
    }
}