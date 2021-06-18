/*  242. Valid Anagram
    Author: facekunal
*/

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val count = IntArray(26)
        
        for(e in s) {
            count[e-'a'] ++
        }
        
        for(e in t) {
            count[e-'a'] --
        }
        
        for(i in 0 until 26) {
            if(count[i] != 0) {
                return false
            }
        }
        
        return true
    }
}