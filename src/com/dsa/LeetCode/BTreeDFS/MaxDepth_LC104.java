package com.dsa.LeetCode.BTreeDFS;

public class MaxDepth_LC104
{
    public int maxDepth(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }

        int left  = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args)
    {
        MaxDepth_LC104 md = new MaxDepth_LC104();

        System.out.println("Max Depth of Tree = " + md.maxDepth(new TreeNode()));
    }
}
