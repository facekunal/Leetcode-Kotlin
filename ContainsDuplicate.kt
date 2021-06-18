/*  217. Contains Duplicate
    Author: facekunal
*/

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = hashSetOf<Int>()
        
        for(e in nums) {
            if(set.contains(e)) {
                return true
            }
            set.add(e)
        }
        return false
    }
}