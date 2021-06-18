/*  1. Two Sum
    Author: facekunal
*/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // value, index
        val map = hashMapOf<Int, Int>()
        
        for(i in 0 until nums.size) {
            val e = nums[i]
            if(map.contains(target - e)) {
                return intArrayOf(map.get(target - e)!!, i)
            }
            map.put(e, i)
        }
        
        throw IllegalArgumentException("No two sum exists")
    }
}