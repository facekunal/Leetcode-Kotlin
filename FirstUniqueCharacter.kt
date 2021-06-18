/*  387. First unique character in a string
    Author: facekunal
*/


class Solution {
    fun firstUniqChar(s: String): Int {
        val count = IntArray(26)
        val indices = IntArray(26)
        
        for(i in 0 until 26) {
            indices[i] = -1
        }
        
        for(i in 0 until s.length) {
            count[s[i]-'a'] ++
            if(indices[s[i]-'a'] == -1) {
                indices[s[i]-'a'] = i
            }
        }
        
        var ans = s.length
        for(i in 0 until 26) {
            if(count[i] == 1) {
                if(indices[i] < ans) {
                    ans = indices[i]
                }
            }
        }
        
        return if(ans == s.length) -1 else ans
    }
}