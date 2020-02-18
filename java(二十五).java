完成课件上面的二叉树进阶笔试题代码
#二叉树的构建及遍历
import java.util.Scanner;

public class Main{
    static class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(char val){
            this.val = val;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.next();
            TreeNode root = creatTree(line);
            inOrder(root);
            System.out.println();
        }
    }
    
    public static TreeNode creatTree(String line) {
        index = 0;
        return buildTree(line);
    }    
    
    static int index  = 0;
    public static TreeNode buildTree(String line){
        char c = line.charAt(index);
        if(c == '#') {
            return null;
        }               
        TreeNode root = new TreeNode(c);
        index++;
        root.left = buildTree(line);
        index++;
        root.right = buildTree(line);
        return root;
    }
    
    public static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}

#二叉树的层次遍历
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
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return result;
        }
        helper(root,0);
        return result;
    }
    
    private void helper(TreeNode root,int level) {
        if(result.size() == level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if(root.left != null){
            helper(root.left,level + 1);
        }
        if(root.right != null) {
            helper(root.right,level +  1);
        }
    
    }
}

#给定二叉树，找到两个指定节点的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        findNode(root,p,q);
        return lca;
    }
    
    public  boolean findNode(TreeNode root,TreeNode p,TreeNode q) {
        if(root == null) {
            return false;
        }
        if(root == p || root == q) {
            return true;
        }
        int left = findNode(root.left,p,q) ? 1 : 0;
        int right = findNode(root.right,p,q) ? 1 : 0;
        int mid  = findNode(root,p,q) ? 1 : 0;
        if(mid + left + right >= 2) {
            lca = root;
        }
        return (left + right + mid) > 0;
    }
}

#二叉搜索树转换成排序的双线链表
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null || (pRootOfTree.left == null && pRootOfTree.right == null)) {
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode leftTail = left;

        while(leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }

        if(left != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }

        TreeNode right = Convert(pRootOfTree.right);
        if(right != null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        return left == null ? pRootOfTree : left;
    }
}

#前序遍历与中序遍历构造二叉树
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
    private int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder,inorder,0,preorder.length);
    }

    private  TreeNode buildTreeHelper(int[] preorder,int[] inorder,int inordeLeft,int inorderRight) {
        if(inordeLeft >= inorderRight) {
            return null;
        }
        if(index >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(inorder,inordeLeft,inorderRight,root.val);
        root.left = buildTreeHelper(preorder,inorder,inordeLeft,pos);
        root.right = buildTreeHelper(preorder,inorder,pos + 1,inorderRight);
        return root;
    }

    private  int find(int[] inorder,int inorderLeft,int inorderRight,int val) {
        for (int i = inorderLeft; i < inorder.length; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
    }
}

#中序遍历与后序遍历构造二叉树
#二叉树创建字符串
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
    private StringBuilder str = new StringBuilder();
    public String tree2str(TreeNode t) {
         if(t == null) {
            return "";
        }
        tree2strHelper(t);
        str.deleteCharAt(0);
        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }
     private void tree2strHelper(TreeNode root) {
        if(root == null) {
            return;
        }
        str.append("(");
        str.append(root.val);
        if(root.left == null && root.right != null){
            str.append("()");
        }
        tree2strHelper(root.left);
        tree2strHelper(root.right);
        str.append(")");
    }
}
#非迭代前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
            }
        }
        return list;
    }
}
#非迭代中序遍历
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
  public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(true) {
           while(cur != null){
               stack.push(cur);
               cur = cur.left;
           }
           if(stack.isEmpty()){
               break;
           }
           TreeNode top = stack.pop();
           list.add(top.val);
           cur = top.right;
        }
        return list;
    }
}
#非迭代后续遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while(true) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            TreeNode top = stack.peek();
            if(top.right == null || prev == top.right) {
                list.add(top.val);
                stack.pop();
                prev = top;
            }else {
                cur = top.right;
            }
        }
        return list;
    }
}