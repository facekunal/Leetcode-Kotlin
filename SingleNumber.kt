/*  136. Single Number
    Author: facekunal
*/

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val sum = nums.sum()
        var setSum = 0
        
        val set = hashSetOf<Int>()
        
        for(e in nums) {
            if(!set.contains(e)) {
                setSum += e
            }
            set.add(e)
        }
        
        return setSum*2 - sum
    }
}