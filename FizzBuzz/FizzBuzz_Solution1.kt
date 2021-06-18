/*  412. Fizz Buzz
    Author: facekunal
*/


class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val ans = MutableList<String>(n, { "" })
        
        
        for(i in 1..n) {
            val divisibleBy3 = i%3
            val divisibleBy5 = i%5
            
            if(i%3 == 0) {
                ans[i-1] += "Fizz"
            }
            if(i%5 == 0) {
                ans[i-1] += "Buzz"
            }
            if(ans[i-1] == "") {
                ans[i-1] = i.toString()
            }
        }
        
        return ans
    }
}