/*  234. Palindrom Linked List
    Author: facekunal
*/

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        // empty LL or single node
        if(head == null || head.next == null) {
            return true
        }
        
        // get second half head
        var (middle, isOdd) = middleOfList(head)
        var second: ListNode? = if(isOdd) middle.next else middle
        
        // reverse first half and get its new head
        var first: ListNode? = reverseList(head, middle)
        
        // compare first reversed half and second half
        while(second != null) {
            if(first!!.`val` != second.`val`) {
                return false
            }
            second = second.next
            first = first.next
        }
        
        return true
    }
    
    fun reverseList(head: ListNode?, delimiter: ListNode): ListNode {
        var prevNode: ListNode? = null
        var currNode: ListNode? = head
        
        while(currNode != null && currNode != delimiter) {
            var nextNode = currNode.next
            
            currNode.next = prevNode
            
            prevNode = currNode
            currNode = nextNode
        }
        
        return prevNode!!
    }
    

    /* Return a Pair of middle node and a boolean
       which is true if list is odd size
    */
    fun middleOfList(head: ListNode?): Pair<ListNode, Boolean> {
        var fast: ListNode? = head
        var slow: ListNode? = head
        while(fast != null && fast.next != null) {
            fast = fast.next.next
            slow = slow!!.next
        }
       
        var isOdd = if(fast != null) true else false
        
        return Pair(slow!!, isOdd!!)
    }
}

