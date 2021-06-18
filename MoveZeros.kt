/*  283. Move Zeros
    Author: facekunal
*/


class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var pi = 0
        
        for(i in 0 until nums.size) {
            if(nums[i] != 0) {
                nums[pi] = nums[i]
                pi ++
            }
        }
        
        for(i in pi until nums.size) {
            nums[i] = 0
        }
    }
}