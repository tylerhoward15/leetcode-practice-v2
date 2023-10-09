/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var kLengthApart = function(nums, k) {
    let lastOne = -1;
    for (let i=0; i < nums.length; i++) {
        if (nums[i] == 1) {
            if (lastOne != -1 && ((i - lastOne-1) < k)) {
                return false;
            }
            lastOne = i;
        }
    }
    return true;
};