/**
 * @param {number[]} nums
 * @return {number}
 */
var thirdMax = function(nums) {
    nums.sort((a, b) => {return a-b}).reverse()
    let count = 1
    let slow = 0
    for (let i = 1; i < nums.length; i++) {
        if (nums[slow] != nums[i]) {
            count++;
            slow = i
            if (count == 3) {
                return nums[slow]
            }
        }
    }

    return nums[0];
};