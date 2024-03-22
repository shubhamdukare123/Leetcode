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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }

        int midIndex = size/2+1;
        temp = head;
        for(int i=1; i<midIndex; i++){
            temp = temp.next;
        }

        return temp;   
    }
}
//Time complexity : O(N + N/2);
//Space complexity: O(1);