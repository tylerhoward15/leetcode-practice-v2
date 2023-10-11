/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    const splt = s.trim().split(" ");
    const ret = new Array();

    for (let i = splt.length-1; i >= 0; i--) {
        const temp = splt[i]
        if (temp != "") {
            ret.push(splt[i] )
        }
    }

    return String(ret.join(" "))
};