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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int l1Size = 0;
        int l2Size = 0;

        while(temp1 != null){
            l1Size++;
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            l2Size++;
            temp2 = temp2.next;
        }

        int start;
        if(l1Size>l2Size) {
            start = l1Size- l2Size;
        }else{
            start = l2Size - l1Size;
        }
        temp1 = l1;
        temp2 = l2;

        if(start == 0){
            int firstElem = 0;
            firstElem = temp1.val;
            while(temp1 != null){
                if( temp1.next != null && temp1.next.val + temp2.next.val > 9){
                    temp1.val++;
                }
                if(temp1.val + temp2.val > 9) {
                    temp1.val = (temp1.val + temp2.val)%10;
                }else {
                    temp1.val = temp1.val + temp2.val;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            
            if(firstElem + l2.val > 9){
                ListNode nList = new  ListNode(1, l1);
               // l1.val = (l1.val + l2.val) % 10;
                return nList;
            }
            
            return l1;
        }
        boolean l1BigSize = false;
        ListNode checkCarry;
        if(l1Size>l2Size) {
            checkCarry = temp1;
            l1BigSize = true;
        }else{
            checkCarry = temp2;
        }
        

        for(int i=1; i<start; i++){
            if(l1BigSize){
                temp1 = temp1.next;
            }else{
                temp2 = temp2.next;
            }
        }

        ListNode bigList;
        ListNode smallList;

        if(l1BigSize){
            bigList = temp1;
            smallList = temp2;
        }else{
            bigList = temp2;
            smallList = temp1;
        }
        //ListNode checkCarry = bigList;
        

        while(bigList.next != null){
            if(bigList.next.val + smallList.val > 9){
                bigList.val++;
                bigList.next.val = (bigList.next.val + smallList.val) % 10;
            }else{
                bigList.next.val = bigList.next.val + smallList.val; 
            }
            bigList = bigList.next;
            smallList = smallList.next;
        }
        bigList = checkCarry;
        boolean allCheck = false;
        while(checkCarry.next != null){
            if(checkCarry.next.val == 10){
                checkCarry.val++;
                checkCarry.next.val = 0;   
            }
            checkCarry = checkCarry.next;
        }
        




        if(l1BigSize){
            if(l1.val > 9){
                ListNode newL1 = new ListNode(1, l1);
                l1.val = l1.val%10;
                return newL1;
            }else{
                return l1;
            }
        }
        else{
            if(l2.val > 9) {
                ListNode newL2 = new ListNode(1, l2);
                l2.val = l2.val%10;
                return newL2;
            }else{
                return l2;
            }
        }
        
    }
}