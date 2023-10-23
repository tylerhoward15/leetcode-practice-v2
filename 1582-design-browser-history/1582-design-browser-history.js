/**
 * @param {string} homepage
 */
var BrowserHistory = function(homepage) {
    this.homepage = homepage
    this.backArr = []
    this.forwardArr = []
    this.current = this.homepage
};

/** 
 * @param {string} url
 * @return {void}
 */
BrowserHistory.prototype.visit = function(url) {
    this.backArr.push(this.current)
    this.forwardArr = []
    this.current = url
    // console.log(`visiting: ${this.current}`)
};

/** 
 * @param {number} steps
 * @return {string}
 */
BrowserHistory.prototype.back = function(steps) {
    let count = steps

    while (this.backArr.length > 0 && count > 0) {
        // console.log('backArr', this.backArr)
        this.forwardArr.push(this.current)
        this.current = this.backArr.pop()
        count--
    }

    return this.current
};

/** 
 * @param {number} steps
 * @return {string}
 */
BrowserHistory.prototype.forward = function(steps) {
    let count = steps

    while (this.forwardArr.length > 0 && count > 0) {
        this.backArr.push(this.current)
        this.current = this.forwardArr.pop()
        count--
    }
    return this.current
};

/** 
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = new BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */
