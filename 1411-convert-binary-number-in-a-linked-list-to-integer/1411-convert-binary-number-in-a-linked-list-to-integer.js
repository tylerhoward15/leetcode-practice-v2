/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var getDecimalValue = function(head) {
    let bits = []
    let sum = 0

    while(head != null) {
        bits.push(head.val);
        head = head.next
    }

    for (let i = bits.length-1; i>=0; i--) {
        sum += bits[i] * (2**(bits.length-1 - i))
    }
    return sum
};