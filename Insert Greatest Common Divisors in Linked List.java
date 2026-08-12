**
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null|| head.next==null)
           return head;

        ListNode ans=head;
        while(head.next!=null){
            ListNode gcd=new ListNode(gcd(head.val,head.next.val));
            gcd.next=head.next;
            head.next=gcd;
           head = head.next.next;
        }
        return ans;     
    }
    public int gcd(int a,int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);    
    }
}