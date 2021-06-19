/*  53. Maximum SubArray
    Author: facekunal
*/

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currSum = nums[0]
        var ans = nums[0]
        
        
        for(i in 1 until nums.size) {
            currSum = Math.max(currSum + nums[i], nums[i])
            ans = Math.max(ans, currSum)
        }
        
        return ans
    }
}