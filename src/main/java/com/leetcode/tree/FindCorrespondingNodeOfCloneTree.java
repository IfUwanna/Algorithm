package com.leetcode.tree;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.tree
 * fileName       : FindCorrespondingNodeOfCloneTree
 * author         : Jihun Park
 * date           : 2022/05/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/17        Jihun Park       최초 생성
 */
public class FindCorrespondingNodeOfCloneTree {

    TreeNode cloneTarget;

    public TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorderTraversal(original, cloned, target);
        return cloneTarget;
    }

    private void  inorderTraversal(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null) return;
        inorderTraversal(original.left,cloned.left,target);
        if(original == target) cloneTarget = cloned;
        inorderTraversal(original.right,cloned.right,target);
    }


}
