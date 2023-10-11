/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    for (let i = 0; i < strs[0].length; i++) {
        const temp = strs[0].charAt(i)
        for (const str of strs) {
            if (str.charAt(i) != temp){
                return strs[0].substring(0,i);
            }
        }
    }

    return strs[0];
};