package com.leetcode.tree;

import com.leetcode.core.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.leetcode.tree
 * fileName       : FindCorrespondingNodeOfCloneTreeTest
 * author         : Jihun Park
 * date           : 2022/05/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/17        Jihun Park       최초 생성
 */
class FindCorrespondingNodeOfCloneTreeTest {

    FindCorrespondingNodeOfCloneTree findCorrespondingNodeOfCloneTree = new FindCorrespondingNodeOfCloneTree();
    @Test
    void getTargetCopy() {
        TreeNode target = new TreeNode(3);
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = target;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        findCorrespondingNodeOfCloneTree.getTargetCopy2(original,cloned,target);
    }
}