using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCode_Arrays
{
    public class MaxProfitArray
    {
        public int MaxProfit(int[] prices)
        {
            var minValue = Int32.MaxValue;
            int maxProfit = 0;
            for(int i =0; i<prices.Length; i++)
            {
                if (prices[i] < minValue)
                    minValue = prices[i];
                else if (prices[i] - minValue > maxProfit)
                    maxProfit = prices[i] - minValue;
            }
            return maxProfit;
        }
    }
}
