/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let indexA = 0
    let indexB = 0
    let str = []
    while (indexA < word1.length || indexB < word2.length) {
        if (indexA <= indexB) {
            str.push(word1.charAt(indexA))
            indexA++;
        } else {
            str.push(word2.charAt(indexB))
            indexB++;
        }
    }

    if (indexA >= word1.length) {
        str.push(word2.substring(indexA).split(""))
    }
    // if (indexB >= word2.length) {
    //     // const temp = word1.substring(indexB).split("")
    //     // console.log(temp)
    //     // str.push(word1.substring(indexB).split(""))
    // } 

    // console.log(indexA,indexB, str)
    return String(str.join(""));
};