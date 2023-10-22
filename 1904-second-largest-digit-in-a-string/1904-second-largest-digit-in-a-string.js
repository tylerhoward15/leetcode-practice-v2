/**
 * @param {string} s
 * @return {number}
 */
var secondHighest = function(s) {
    let max = -1
    let secondMax = -1
    // const set = new Set()

    Array.from(s).forEach(char => {
        const temp = parseInt(char)
        if (!isNaN(temp)) {
            if (temp > max) {
                secondMax = max
                max = temp
            } else if (temp != max && temp > secondMax) {
                secondMax = temp
            }
        }
    })

    // if (set.size < 2) {
    //     return -1;
    // }

    return secondMax
};

