/**
 * @param {number[]} nums
 * @return {number}
 */
var thirdMax = function(nums) {
    const temp = nums.sort((a, b) => {return a-b}).reverse().slice()
    let count = 1
    let slow = 0
    for (let i = 1; i < temp.length; i++) {
        if (temp[slow] != temp[i]) {
            count++;
            slow = i
            if (count == 3) {
                return temp[slow]
            }
        }
    }

    return temp[0];
};