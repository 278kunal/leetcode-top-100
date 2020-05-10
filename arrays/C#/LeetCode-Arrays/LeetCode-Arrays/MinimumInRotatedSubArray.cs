using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_Arrays
{
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    class MinimumInRotatedSubArray
    {
        public int FindMin(int[] nums)
        {
            var pos = 0;
            for (int i = 1; i < nums.Length; i++)
            {
                if (nums[i] < nums[i - 1])
                {
                    pos = i;
                    break;
                }
            }
            return nums[pos];
        }
    }
}
