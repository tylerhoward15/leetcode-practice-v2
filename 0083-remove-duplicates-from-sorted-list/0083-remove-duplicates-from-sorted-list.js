/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if (head == null || head.next == null) {
        return head
    }
    let ret = head
    while(head != null) {
        while (head.next != null && head.next.val == head.val) {
            head.next = head.next.next
        }
        head = head.next;
    }
    return ret;
};