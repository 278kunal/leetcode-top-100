using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode_Arrays
{
    class _3sum
    {
        public IList<IList<int>> ThreeSum(int[] nums)
        {
            //base case
            if (nums.Length <= 2)
                return new List<IList<int>>();

            Array.Sort(nums);
            var tripletList = new List<List<int>>();
            var prevelement = int.MinValue;
            for (int i = 0; i < nums.Length; i++)
            {
                if (prevelement == nums[i])
                    continue;
                var low = i + 1;
                var high = nums.Length - 1;
                while (low < high)
                {
                    var sum = 0;
                    sum = nums[i] + nums[low] + nums[high];
                    if (sum > 0)
                    {
                        high--;
                    }
                    else if (sum < 0)
                    {
                        low++;
                    }
                    else
                    {
                        tripletList.Add(new List<int>() { nums[i], nums[low], nums[high] });
                        low++;
                        high--;
                    }
                }
                prevelement = nums[i];
            }
            var removeDuplicatesinList = tripletList.GroupBy(x => String.Join(",", x))
                         .Select(x => x.First().ToList())
                         .ToList();
            return new List<IList<int>>(removeDuplicatesinList);
        }
    }
}