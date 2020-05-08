using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_Arrays
{
    class NonDuplicates
    {
        public bool ContainsDuplicate(int[] nums)
        {
            var nonduplicates = new HashSet<int>();
            foreach (var i in nums)
            {
                if (!nonduplicates.Contains(i))
                    nonduplicates.Add(i);
                else
                    return true;
            }
            return false;
        }
    }
}
