/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let ret = []
    const max = Math.max(...candies)

    candies.forEach((candy) => {
        ret.push((candy+extraCandies) >= max);
    })

    return ret;
};