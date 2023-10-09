/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let sum = 0;
    for (let i=0; i<nums.length; i++) {
        nums[i] += sum;
        sum = nums[i];
    }
    return nums;
};