/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const numsLength = nums.length;
  const diffMap = {};
  for (let i = 0; i < numsLength; i++) {
    const diff = target - nums[i];
    if (diffMap[nums[i]] > -1) {
      return [diffMap[nums[i]], i];
    } else {
      diffMap[diff] = i;
    }
  }
};

//console.log(twoSum([2,7,11,15], 9));
