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

//optimized approach
class Solution {
    public ListNode middleNode(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;

     while(fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == null){
            break;
        }
     }  
     return slow; 
    }
}

//time complexity : O(N)
//space complexity: O(1)