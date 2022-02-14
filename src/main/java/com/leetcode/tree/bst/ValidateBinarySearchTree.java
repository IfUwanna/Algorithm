package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : ValidateBinarySearchTree
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        //1. Recursion
        return isValidBST(root,null,null);
    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        //1. Recursion - DFS
        if(root == null) return true;
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }



    public boolean isValidBST2(TreeNode root) { // [5,4,6,null,null,3,7] fail   72 / 80 test cases passed.
        //1. Recursion - DFS
        if(root == null) return true;
        if(root.left != null && root.val <= root.left.val){
            return false;
        }
        if(root.right != null && root.val >= root.right.val){
            return false;
        }
        return isValidBST2(root.left) && isValidBST2(root.right);
    }

}
