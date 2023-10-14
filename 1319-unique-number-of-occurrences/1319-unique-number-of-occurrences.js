/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {
    const map = new Map()
    arr.forEach(elem => {
        map.set(elem, getOrDefault(map, elem)+1)
    })

    const temp = []
    for (const [key, value] of map) {
        temp.push(value)
    }
    const set = new Set(temp)

    return temp.length == set.size
};

function getOrDefault(map, val) {
    const temp = map.get(val)
    return temp != null ? temp : 0
}