/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let beginning = 0
    let end = k
    let currentSum = calcSum(nums,0,k)
    let maxSum = currentSum
    
    if (k == nums.length) {
        return maxSum / k
    }

    if (k == 1) {
        return Math.max(...nums)
    }
    // beginning++
    // end++

    while (end < nums.length) {
        currentSum = currentSum - nums[beginning] + nums[end]
        maxSum = currentSum > maxSum ? currentSum : maxSum

        beginning++;
        end++
    }

    return maxSum / k;
    
};

function calcSum(arr, start, end) {
    let sum = 0

    while(start<end) {
        sum += arr[start]
        start++
    }

    return sum
}
