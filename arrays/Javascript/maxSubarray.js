/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
  const numsLength = nums.length;
  let globalStreak = nums[0];
  let currentStreak = nums[0]
  for (let i = 1; i < numsLength; i++) {
    currentStreak = Math.max(nums[i], currentStreak + nums[i]);
    if (currentStreak > globalStreak) {
      globalStreak = currentStreak;
    }
  }
  return globalStreak;
};
