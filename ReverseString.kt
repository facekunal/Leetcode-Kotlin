/*  344. Reverse String 
    Author: facekunal
*/

class Solution {
    fun reverseString(s: CharArray): Unit {
        
        for(i in 0 until s.size/2) {
            //swap i, s.size-1-i
            val temp = s[i]
            s[i] = s[s.size-1-i]
            s[s.size-1-i] = temp
        }
    }
}