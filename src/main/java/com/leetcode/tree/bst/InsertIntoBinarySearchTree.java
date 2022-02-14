package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : InsertIntoBinarySearchTree
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class InsertIntoBinarySearchTree {
    /**
     * methodName : 701. Insert into a Binary Search Tree [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/insert-into-a-binary-search-tree/
     * @param root
     * @param val
     * @return tree node
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {

        //1. Recursion
        if(root==null) return new TreeNode(val);
        if(root.val > val){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }

    public TreeNode insertIntoBST2(TreeNode root, int val) {

        //2. Iteration
        if(root==null) return new TreeNode(val);
        TreeNode cur = root;
        while(cur != null){
            if(cur.val > val){
                if(cur.left == null){
                    cur.left = new TreeNode(val);
                    break;
                }else{
                    cur = cur.left;
                }
            }else{
                if(cur.right == null){
                    cur.right = new TreeNode(val);
                    break;
                }else{
                    cur = cur.right;
                }
            }
        }
        return  root;
    }
}
