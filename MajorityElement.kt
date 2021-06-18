/*  169. Majority Element
    Author: facekunal
*/

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var curr = nums[0]
        var count = 1
        
        for(e in nums) {
            if(e == curr) {
                count ++
            } else {
                count --
                
                if(count == 0) {
                    curr = e
                    count = 1
                }
            }
        }
        
        // verify
        count = 0
        for(e in nums) {
            if(e == curr) {
                count ++
                if(count > nums.size/2) {
                    return curr;
                }
            }
        }

        throw IllegalArgumentException("No majority element exist")
    }
}