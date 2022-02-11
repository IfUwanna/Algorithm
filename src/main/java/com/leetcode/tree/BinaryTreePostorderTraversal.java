package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        // 1. Recursion
        List<Integer> list = new ArrayList<Integer>();
        postorderTraversal(root,list);
        return list;

    }
    private void postorderTraversal(TreeNode node,List<Integer> list) {
        if(node == null){return;}
        postorderTraversal(node.left,list);
        postorderTraversal(node.right,list);
        list.add(node.val);
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        // 2. Iteration
        List<Integer> list = new ArrayList<Integer>();
        if(root==null){return list;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(0,curr.val);
            if(curr.left!=null) stack.push(curr.left);  // 둘을 바꾸면 levelorder가 되는듯?
            if(curr.right!=null) stack.push(curr.right);
        }
        return list;

    }

    public void pushAllLeft(TreeNode node, Stack stack){
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }

}
