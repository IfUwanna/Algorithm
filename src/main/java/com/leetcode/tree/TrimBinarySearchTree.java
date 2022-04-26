package com.leetcode.tree;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.tree
 * fileName       : 669. Trim a Binary Search Tree [Medium]
 * author         : Jihun Park
 * date           : 2022/04/26
 * description    : https://leetcode.com/problems/trim-a-binary-search-tree/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/04/26        Jihun Park       최초 생성
 */
public class TrimBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;

        if (root.val < low) return trimBST(root.right, low, high);
        if (root.val > high) return trimBST(root.left, low, high);

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
