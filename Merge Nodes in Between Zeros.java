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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode currNode = head.next;
        ListNode dumy = newHead;
        int sum = 0;
        while (currNode != null) {
            if (currNode.val != 0) {
                sum += currNode.val;
            }
            if (currNode.val == 0) {
                dumy.next = new ListNode(sum);
                dumy = dumy.next;
                sum = 0;
            }
            currNode = currNode.next;
        }
        return newHead.next;
    }
}