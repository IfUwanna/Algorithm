package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * packageName    : com.leetcode.tree
 * fileName       : BinaryTreeInorderTraversal
 * author         : Jihun Park
 * date           : 2022/01/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/27        Jihun Park       최초 생성
 */
public class BinaryTreeInorderTraversal {
    /**
     * methodName : 94. Binary Tree Inorder Traversal [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/binary-tree-inorder-traversal/
     * @param root
     * @return list
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        // 1. Recursion - inorder
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {

        // 2. Iteration - inorder
        List<Integer> list = new ArrayList<>();
        if(root == null){return list;}
        Stack<TreeNode> stack = new Stack<>();

        // push self and all left
        pushAllLeft(root, stack);
//        while(root != null){
//            stack.push(root);
//            root = root.left;
//        }

        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            // push right and all right's left
            pushAllLeft(cur.right, stack);
//            TreeNode right = cur.right;
//            while(right != null){
//                stack.push(right);
//                right = right.left;
//            }
        }
        return list;
    }

    public void pushAllLeft(TreeNode node, Stack stack){
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }

    private void inorderTraversal(TreeNode node,List<Integer> list){
        if(node == null) return;
        inorderTraversal(node.left,list);
        list.add(node.val);
        inorderTraversal(node.right,list);
    }

    public List<Integer> inorderTraversal4(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }
}
