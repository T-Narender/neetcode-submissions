/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        return isValidBstTree(root,null,null);
    }

    public boolean isValidBstTree(TreeNode root, TreeNode min, TreeNode max){
        if(root == null){
            return true;
        }

        if(min!=null && root.val <= min.val){
            return false;
        }

        if(max!=null && root.val >= max.val){
            return false;
        }

        return isValidBstTree(root.left,min,root) && isValidBstTree(root.right,root,max);
    }
}
