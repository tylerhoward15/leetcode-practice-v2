/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    // if (s.charAt(s.length-1) == " ") {
    //     return 0
    // }
    const splt = s.trim().split(" ");
    return splt[splt.length-1].length;
    
};