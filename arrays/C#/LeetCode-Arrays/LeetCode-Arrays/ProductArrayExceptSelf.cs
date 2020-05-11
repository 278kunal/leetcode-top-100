using System;
using System.Collections.Generic;
using System.Text;


//Question: https://leetcode.com/problems/product-of-array-except-self/

namespace LeetCode_Arrays
{
    class ProductArrayExceptSelf
    {
        public int[] ProductExceptSelf(int[] nums)
        {
            //Edge case
            if (nums.Length <= 2)
            {
                Array.Reverse(nums);
                return nums;
            }
            var result = new int[nums.Length];
            var rightmultiply = new int[nums.Length];
            rightmultiply[0] = nums[nums.Length - 1];
            for (int i = 1; i < nums.Length ; i++)
            {
                rightmultiply[i] = rightmultiply[i - 1] * nums[nums.Length - i -1];
            }
            var r = 1;
            int j, multiplyfactor;
            for(int i = 0; i < nums.Length; i++)
            {
                j = nums.Length - i - 2;
                if (j < 0)
                    multiplyfactor = 1;
                else
                    multiplyfactor = rightmultiply[j];

                result[i] = r * multiplyfactor;
                r = r * nums[i];
            }
            return result;
        }
    }
}
