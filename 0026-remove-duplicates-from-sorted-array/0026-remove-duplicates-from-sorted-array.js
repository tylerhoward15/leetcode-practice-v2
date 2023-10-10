/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let slow = 0
    let fast = 1
    let count = 0

    if (nums.length == 1) {
        return 1
    }

    while (fast < nums.length) {
        if (nums[slow] == nums[fast]) {
            fast++
        } else {
            count++
            nums[slow+1] = nums[fast];
            slow++
        }
    }
    return count+1
};