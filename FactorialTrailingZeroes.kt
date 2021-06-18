/*  172. Factorial Trailing Zeroes
    Author: facekunal
*/

class Solution {
    fun trailingZeroes(n: Int): Int {
        var count = 0
        var i = 5

        while(i <= n) {
            count += n/i
            i *= 5
        }
        
        return count
    }
}