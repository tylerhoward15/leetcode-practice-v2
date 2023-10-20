/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const map = new Map()
    const used = new Set()
    const chars = pattern.split('')
    const words = s.split(" ")

    if (chars.length != words.length) return false;
    // console.log(`words or s`, words)
    // console.log(`chars or pattern`, chars)

    const bool = words.every((word, index) => {
        if (!map.has(word)) {
            if (used.has(chars[index])) {
                return false
            }
            map.set(word, chars[index])
            used.add(chars[index])
            return true;
        } else {
            return map.get(word) == chars[index]
        }
    })
    return bool;
};