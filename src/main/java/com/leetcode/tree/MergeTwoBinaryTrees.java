package com.leetcode.tree;

import com.leetcode.core.TreeNode;

/**
 * packageName    : com.leetcode.easy
 * fileName       : MergeTwoBinaryTrees
 * author         : Jihun Park
 * date           : 2022/01/12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/12        Jihun Park       최초 생성
 */
public class MergeTwoBinaryTrees {
    /**
     * methodName : 617. Merge Two Binary Trees [Easy]
     * author : Jihun Park
     * description : https://leetcode.com/problems/merge-two-binary-trees/
     * @param t1
     * @param t2
     * @return tree node
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null){ // 한쪽 노드만 남아있으면 그대로 붙임(하위 노드들도 더이상 머지를 안해도 되기때문에 그대로)
            return t2;
        } else if (t2 == null){ // 한쪽 노드만 남아있으면 그대로 붙임(하위 노드들도 더이상 머지를 안해도 되기때문에 그대로)
            return t1;
        } else{  // 양쪽다 노드가 있는 케이스

            // 머지된 신규 노드 생성
            TreeNode tree = new TreeNode(t1.val+t2.val);
            // DFS 알고리즘과 유사하게 전위 순회(pre-order Traversal)로 진행. 재귀로 자식노드가 끝까지 가서  null이 나오면 재귀호출 스택을 쭉 타고 올라와서 루트까지 머지된 노드를 반환한다
            tree.left = mergeTrees(t1.left, t2.left);        // left
            tree.right = mergeTrees(t1.right, t2.right);     // right

//            t1.val  = t1.val + t2.val;
//            t1.left = mergeTrees(t1.left,t2.left);
//            t1.right = mergeTrees(t1.right,t2.right);
            return tree;
        }
    }

}
