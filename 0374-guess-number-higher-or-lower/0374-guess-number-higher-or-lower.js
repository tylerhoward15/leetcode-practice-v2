/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function(n) {
    if (n == 1) {
        return 1
    }

    if (n == 2) {
        let temp = guess(1)
        return temp == 0 ? 1 : 2
    }


    let upper = n
    let lower = 0
    let myGuess = Math.floor(n/2)
    let answer = guess(myGuess)

    while (answer != 0) {
        answer = guess(myGuess)
        if (answer == -1) {
            upper = myGuess
            myGuess -= Math.ceil((upper-lower)/2)
        } else if (answer == 1) {
            lower = myGuess
            myGuess += Math.ceil((upper-lower)/2)
        } else {
            return myGuess
        }
    }

    return myGuess
};