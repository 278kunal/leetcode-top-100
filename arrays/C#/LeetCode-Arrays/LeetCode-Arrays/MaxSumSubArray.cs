using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode_Arrays
{
    //Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6.
    //https://leetcode.com/problems/maximum-subarray/
    class MaxSumSubArray
    {
        public int MaxSubArray(int[] nums)
        {
            var maxSumSofar = 0;
            var maxSumCurrent = 0;
            for(int i = 0; i < nums.Length; i++)
            {
                maxSumCurrent += nums[i];
                if (maxSumCurrent < 0)
                    maxSumCurrent = 0;
                else if(maxSumCurrent > maxSumSofar)
                {
                    maxSumSofar = maxSumCurrent;
                }
            }
            if (maxSumSofar == 0)
                maxSumSofar = nums.Max();
            return maxSumSofar;
        }
    }
}
