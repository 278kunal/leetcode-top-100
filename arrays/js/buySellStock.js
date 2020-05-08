/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  const pricesLength = prices.length;
  let currentMin = prices[0];
  let currentMax = prices[0];
  let buyPrice = 0;
  let sellPrice = 0;
  let profit = 0;
  for (let i = 1; i < pricesLength; i++) {
    if (prices[i] > currentMax && (prices[i] - currentMin) > profit) {
      currentMax = prices[i];
      sellPrice = currentMax;
      buyPrice = currentMin;
    } else if (prices[i] < currentMin) {
      currentMin = prices[i];
      currentMax = prices[i];
    }
    profit = sellPrice - buyPrice;
  }
  return pricesLength ? profit : 0;
};

/* console.log(maxProfit([7, 1, 5, 3, 6, 4])); // 5
console.log(maxProfit([2, 4, 1, 2, 1, 2])); // 2
console.log(maxProfit([])); // 0
console.log(maxProfit([7,3])); // 0
console.log(maxProfit([1, 4, 8, 2, 3, 1, 9])); // 8
console.log(maxProfit([3, 3, 3, 3, 3, 3, 3, 3, 3])); //0
console.log(maxProfit([1, 2, 3, 4, 3, 2, 1])); //3
console.log(maxProfit([7, 6, 5, 4, 2, 2, 1])); // 0
console.log(maxProfit([1, 2, 3, 4, 5, 6, 7])); // 6
console.log(maxProfit([1, 2, 3, 1, 2, 3, 1])); // 2
console.log(maxProfit([9, 4, 8, 2, 3, 1, 9])); // 8 */
