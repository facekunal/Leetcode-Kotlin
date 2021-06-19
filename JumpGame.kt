/*  55. Jump Game
    Author: facekunal
*/

class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxReach = 0 + nums[0]
        
        for(i in 1 until nums.size) {
            if(i > maxReach) {
                return false
            }
            maxReach = maxOf(maxReach, i + nums[i])
        }
        
        return true
    }
}

