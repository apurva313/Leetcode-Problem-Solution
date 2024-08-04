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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(-1, head);
        ListNode current = p;
        while (current.next != null) {
            if (current.next.val != val) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return p.next;
    }
}
