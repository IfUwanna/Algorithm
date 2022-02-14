package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : SearchInBinarySearchTree
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class SearchInBinarySearchTree {
    /**
     * methodName : 700. Search in a Binary Search Tree [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/search-in-a-binary-search-tree/
     * @param root
     * @param val
     * @return tree node
     */
    public TreeNode searchBST(TreeNode root, int val) {
        //1. Recursion - DFS (Binary Search Tree)
        if(root == null) return null;
        if(root.val == val) return root;

        return root.val > val? searchBST(root.left,val) : searchBST(root.right,val);
    }

    public TreeNode searchBST2(TreeNode root, int val) {
        //2. Recursion - DFS (Normal Binary Tree)
        if(root == null) return null;
        if(root.val == val) return root;

        TreeNode left = searchBST(root.left,val);
        if(left != null){
            return left;
        }else{
            return searchBST(root.right,val);
        }
    }

    public TreeNode searchBST3(TreeNode root, int val) {
        //3. Iteration - BFS (Binary Search Tree)
        if(root == null) return null;
        while (root != null && root.val != val) {
            root = root.val < val ? root.right : root.left;
        }
        return root;
    }

    public TreeNode searchBST4(TreeNode root, int val) {
        //4. Iteration - BFS (Normal Binary Tree)
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur.val == val) return cur;
            if(cur.left != null) q.offer(cur.left);
            if(cur.right != null) q.offer(cur.right);
        }
        return null;
    }


}
