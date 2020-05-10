using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_Arrays
{
    class SearchInRotatedArray
    {
        public int Search(int[] nums, int target)
        {
            if (nums == null || nums.Length == 0)
                return -1;
            var low = 0;
            var high = nums.Length - 1;
            var right = nums[nums.Length - 1];
            int mid;
            while (low <= high)
            {
                mid = (low + high) / 2;
                if (target == nums[mid])
                    return mid;
                if (right > nums[mid])
                {
                    if (target > nums[mid] && target <= right)
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
                else
                {
                    if (target < nums[mid] && nums[0] <= target)
                        high = high - 1;
                    else
                        low = low + 1;
                }
            }
            return -1;
        }
    }
}
