/*  206. Reverse Linked List
    Author: facekunal
*/

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null || head.next == null) {
            return head
        }
        
        var p: ListNode? = null
        var q: ListNode? = head
        
        while(q != null) {
            var r = q.next
            q.next = p
            p = q
            q = r
        }
        
        return p
    }
}