/*  125. Valid Palindrome
    Author: facekunal
*/

class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var i = 0
        var j = s.length-1
        
        while(i < j) {
            val isFirstValid = isAlphaNumeric(s[i])
            val isSecondValid = isAlphaNumeric(s[j])
            
            if(isFirstValid && isSecondValid) {
                if(s[i].toLowerCase() != s[j].toLowerCase()) {
                    return false
                }
                i++
                j--
            } else {
                if(!isFirstValid) {
                    i++
                }
                if(!isSecondValid) {
                    j--
                }
            }
        }
        
        return true
    }
    
    fun isAlphaNumeric(c: Char) = when(c) {
            in 'a'..'z' -> true
            in 'A'..'Z' -> true
            in '0'..'9' -> true
            else -> false
        }
}