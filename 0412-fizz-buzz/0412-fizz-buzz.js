/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    let ret = []
    for (let i = 1; i <= n; i++) {
        let temp = []
        if (i % 3 == 0) {
            temp.push('Fizz')
        }
        if (i % 5 == 0) {
            temp.push("Buzz")
        }
        if (temp.length == 0){
            temp.push(String(i))
        }
        ret.push(temp.join(''))
    }
    return ret;
};