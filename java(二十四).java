完成课件上面的二叉树笔试题代码
检查是否是相同的树
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

另一个树的子树
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
         if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
       boolean flag =false;
        if(s.val == t.val) {
           flag = isSameTree(s,t);
       }
       
        if(!flag) {
            flag = isSubtree(s.left,t);
        }
        if(!flag) {
            flag = isSubtree(s.right,t);
        }
        return flag;
    }
    
     public boolean isSameTree(TreeNode s,TreeNode t) {
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(s.val != t.val) {
            return false;
        }
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
}

二叉树最大深度
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        } 
        int leftDepth  = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if(leftDepth -  rightDepth > 1 ||  leftDepth -  rightDepth < -1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth  = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}

判断一个二叉树是否是平衡二叉树
 public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left - right > 1 || left - right < -1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int maxleft = 1 + maxDepth(root.left);
        int maxright = 1 + maxDepth(root.right);
        return  maxleft > maxright ? maxleft : maxright;
    }

对称二叉树
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        return isSame(root.left,root.right);
    }
    
    public boolean isSame(TreeNode left,TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSame(left.left,right.right) && isSame(left.right,right.left);
    }
}