/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    const sum = nums.reduce((acc, curr) => acc+curr,0);
    let expectedSum = 0;
    for (let i = 1; i <= nums.length; i++) {
        expectedSum += i;
    }
    return expectedSum - sum;    
};