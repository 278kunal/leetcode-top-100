using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_Arrays
{
    public class Solution
    {
        public int[] TwoSum(int[] nums, int target)
        {
            var numbersindex = new Dictionary<int, int>();
            for(int i = 0; i < nums.Length; i++)
            {
                if (numbersindex.ContainsKey(target - nums[i]))
                    return new int[] { numbersindex[target - nums[i]], i };
                else
                    numbersindex[nums[i]] = i;
            }
            return null;

        }
    }
}
