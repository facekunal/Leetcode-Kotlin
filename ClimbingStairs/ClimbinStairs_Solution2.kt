/*  70. Climbing Stairs
    Author: facekunal
*/

class Solution {
    fun climbStairs(n: Int): Int {
        var curr = 1
        var prev = 1
        var next = 1
        
        
        for(i in 2..n) {
            next = curr + prev
            
            prev = curr
            curr = next
        }
        
        return next
    }
}
