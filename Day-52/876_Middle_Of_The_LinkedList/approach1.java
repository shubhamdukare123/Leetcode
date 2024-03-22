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
        ListNode sHead = head;
        int size = 0;
        while(head.next != null){
            
            size++;
            head = head.next;
        }
        int midElem = size/2;
        ListNode middle = sHead;
        if( size%2 == 1) {
            midElem++;
        }
        for(int i=0; i<midElem; i++){
            middle = middle.next;
        }

        return middle;

    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)