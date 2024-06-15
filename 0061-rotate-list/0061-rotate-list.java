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
    public int size(ListNode head){
        if(head == null)
            return 0;
        return 1+size(head.next);
    }
    public ListNode rotateRight(ListNode head, int k) {
        int size = size(head);
        int rot = 0;
        if(size!=0)
            rot = k%size;
        else
            return head;
        
        if(rot == 0){
            return head;
        }
        rot = size - 1 - rot;
        ListNode th = head;
        for(int i=0;i<rot;i++){
            head= head.next;
        }
        ListNode temp = head.next;
        ListNode temp1 = head.next;
        head.next = null;
        while(temp!=null && temp.next!=null){
            temp = temp.next;
        }
        if(temp.next == null)
            temp.next = th;
        return temp1;
    }
}