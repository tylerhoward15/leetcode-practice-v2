/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const map = new Map()
    const target = nums.length / 2
    let ret = -1

    nums.forEach((num) => {
        const upd = getOrDefault(map, num, 0)+1
        if (upd > target) {
            ret = num;
        }
        map.set(num,upd)
    })
    return ret
};

var getOrDefault = function(map, value, def) {
    const temp = map.get(value)

    return temp != undefined ? temp : def;
}