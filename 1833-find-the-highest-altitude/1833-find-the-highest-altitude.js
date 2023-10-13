/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
    let max = 0
    let curr = 0

    gain.forEach((alt, index) => {
        let temp = curr+alt
        if (temp > max) {
            max = temp
        }
        curr = temp;
    })

    return max
};