/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    const res = new Array(nums.length)
    let slow = 0
    let fast = 0
    let count = 0

    while (fast < nums.length) {
        if (nums[fast] != val) {
            res[slow] = nums[fast]
            slow++
            fast++
        } else {
            count++
            fast++
        }
    }

    for (const [index, value] of nums.entries()) {
        nums[index] = res[index];
    }
    return nums.length - count
};