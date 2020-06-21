给定一个非空二叉树，返回其最大路径和。

本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getmaxPathSum(root);
        return max;
    }
    private int getmaxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getmaxPathSum(root.left);
        int right=getmaxPathSum(root.right);
        int tmp=Math.max(left,0)+Math.max(right,0)+root.val;
        max=Math.max(max,tmp);
        return root.val+Math.max(Math.max(left,right),0);
    }
}