/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    const ret = getBaseLog(4, n)

    return Number.isInteger(ret);
};

function getBaseLog(x, y) {
  return Math.log(y) / Math.log(x);
}
