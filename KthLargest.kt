/*  215. Kth largest element in an array
    Author: facekunal
*/

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val minHeap = PriorityQueue<Int>()
        
        for(e in nums) {
            minHeap.offer(e)
            
            if(minHeap.size > k) {
                minHeap.poll()
            }
        }
        
        return minHeap.peek()
    }
}