/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    let vowels = []
    let ret = []

    for (const letter of s) {
        if (isVowel(letter)) {
            vowels.push(letter);
        }
    }

    Array.from(s).forEach((letter, index) => {
        if (isVowel(letter)) {
            ret[index] = vowels.pop()
        } else {
            ret[index] = letter
        }
    })

    return ret.join('');
};

function isVowel (letter) {
    const vowels = ['a', 'e','i','o','u']
    const bool = vowels.indexOf(letter.toLowerCase()) != -1
    return bool
}