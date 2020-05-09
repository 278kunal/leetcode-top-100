/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  const numsLength = nums.length;
  const numsMap = {}
  for (let i = 0; i < numsLength; i++) {
    if (numsMap[nums[i]]) {
      return true;
    }
    numsMap[nums[i]] = 1;
  }
  return false;
};

// console.log(containsDuplicate([1, 2, 3, 1]));
