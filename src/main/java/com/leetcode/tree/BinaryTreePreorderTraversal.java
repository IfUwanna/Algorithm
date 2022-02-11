
package com.leetcode.tree;

import com.leetcode.core.TreeNode;

import java.util.*;

/**
 * packageName    : com.leetcode.tree
 * fileName       : BinaryTreePreorderTraversal
 * author         : Jihun Park
 * date           : 2022/01/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/27        Jihun Park       최초 생성
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        // 1. dfs  - recursion
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }

    private void preorderTraversal(TreeNode node,List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preorderTraversal(node.left,list);
        preorderTraversal(node.right,list);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {

        // 2. iteration  - preorder
        List<Integer> list = new ArrayList<>();

        if(root == null){return list;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return list;
    }



}
