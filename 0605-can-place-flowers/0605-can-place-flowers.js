/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    let count = 0;
    flowerbed.forEach((flower, index) => {
        if (isValid(flowerbed, index)) {
            count++;
            flowerbed[index] = 1
        }
    })

    return n <= count
};

function isValid(flowerbed, index) {
    let left = flowerbed[index-1]
    let right = flowerbed[index+1]

    left = left == null ? 0 : left
    right = right == null ? 0 : right
    return left == 0 && right == 0 && flowerbed[index] == 0
}