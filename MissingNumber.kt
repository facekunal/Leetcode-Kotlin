/*  268. Missing Number
    Author: facekunal
*/

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var ans = nums.size
        
        for(i in 0 until nums.size) {
            ans = ans xor nums[i] xor i
        }
        
        return ans
    }
}