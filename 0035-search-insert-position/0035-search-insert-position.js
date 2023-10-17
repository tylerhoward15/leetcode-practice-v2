/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    const temp = nums.indexOf(target)
    if (temp != -1) {
        return temp;
    }
    let current = 0
    while (nums[current] < target) {
        current++;
    }

    return current;
};