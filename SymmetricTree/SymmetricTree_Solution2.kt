/*  101. Symmetric Tree
    Author: facekunal
*/

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null) {
            return true
        }
        
        val queue = mutableListOf<TreeNode?>()
        queue.add(root)
        queue.add(root)
        
        while(!queue.isEmpty()) {
            val n1 = queue.removeAt(0);
            val n2 = queue.removeAt(0);
            
            if(n1 == null && n2 == null) {
                return continue
            }
            
            if(n1 == null || n2 == null) {
                return false
            }
            
            if(n1.`val` != n2.`val`) {
                return false
            }
            
            queue.add(n1.left)
            queue.add(n2.right)
            queue.add(n1.right)
            queue.add(n2.left)
        }
        
        return true
    }
}