/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    const mag = new Map()

    Array.from(magazine).forEach(letter => {
        mag.set(letter, getOrDefault(mag, letter)+1)
    })

    return Array.from(ransomNote).every(letter => {
        const temp = mag.get(letter)
        if (temp > 0) {
            mag.set(letter, temp-1)
            return true
        } else {
            return false
        }
    });
};

function getOrDefault(map, letter) {
    const res = map.get(letter)
    return res == null ? 0 : res;
}