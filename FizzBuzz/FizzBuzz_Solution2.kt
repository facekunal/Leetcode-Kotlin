/*  412. Fizz Buzz
    Author: facekunal
*/

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val ans = MutableList<String>(n, { it -> (it+1).toString() })
        
        var count3 = 1
        var count5 = 1
        
        for(i in 1..n) {
            count3++
            count5++
            if(count3 > 3 && count5 > 5) {
                ans[i-1] = "FizzBuzz"
                count3 = 1
                count5 = 1
            } else if(count3 > 3) {
                count3 = 1
                ans[i-1] = "Fizz"
            } else if(count5 > 5) {
                count5 = 1
                ans[i-1] = "Buzz"
            }
        }
        
        return ans
    }
}