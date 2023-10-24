/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tensOne = 0;
        int tensTwo = 0;
        BigInteger one = BigInteger.ZERO;
        BigInteger two = BigInteger.ZERO;

        while (l1 != null) {
            BigInteger power = BigInteger.valueOf(10).pow(tensOne);
            BigInteger inter = power.multiply(BigInteger.valueOf(l1.val));

            one = one.add(inter);

            tensOne++;
            l1 = l1.next;
        }
        while (l2 != null) {
            BigInteger power = BigInteger.valueOf(10).pow(tensTwo);
            BigInteger inter = power.multiply(BigInteger.valueOf(l2.val));

            two = two.add(inter);

            tensTwo++;
            l2 = l2.next;
        }
        BigInteger sum = one.add(two);

        String tmp = sum.toString();
        String[] arr = tmp.split("");

        ListNode head = new ListNode(Integer.parseInt(arr[arr.length-1]));
        ListNode current = head;
        for (int i=arr.length-2; i>=0; i--) {
            current.next = new ListNode(Integer.parseInt(arr[i]));
            current = current.next;
        }

        return head;
    }
}