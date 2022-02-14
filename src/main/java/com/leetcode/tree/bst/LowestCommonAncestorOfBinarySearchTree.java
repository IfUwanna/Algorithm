package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : LowestCommonAncestorOfBinarySearchTree
 * author         : Jihun Park
 * date           : 2022/02/14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/14        Jihun Park       최초 생성
 */
public class LowestCommonAncestorOfBinarySearchTree {
    /**
     * methodName : 235. Lowest Common Ancestor of a Binary Search Tree
     * author : Jihun Park
     * description : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
     * @param root
     * @param p
     * @param q
     * @return tree node
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 1. Recursion
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
