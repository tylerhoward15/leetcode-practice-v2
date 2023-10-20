/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    const maps = new Map()
    const mapt = new Map()
    const chars = s.split('')
    const chart = t.split('')

    chars.forEach((letter) => {
        maps.set(letter, getOrZero(maps, letter)+1);
    })
    chart.forEach((letter) => {
        mapt.set(letter, getOrZero(mapt, letter)+1);
    })

    for (const [k,v] of chart) {
        const temp = maps.get(k)
        if (temp == undefined || temp <= 0) {
            return k;
        } else {
            maps.set(k, temp-1)
        }
    }

    return null;
};

function getOrZero(map, val) {
    const temp = map.get(val)
    
    return temp == null ? 0 : temp;
}