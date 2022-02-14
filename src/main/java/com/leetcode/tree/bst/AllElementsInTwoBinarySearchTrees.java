package com.leetcode.tree.bst;

import com.leetcode.core.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * packageName    : com.leetcode.tree.bst
 * fileName       : AllElementsInTwoBinarySearchTrees
 * author         : Jihun Park
 * date           : 2022/01/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/26        Jihun Park       최초 생성
 */
public class AllElementsInTwoBinarySearchTrees {


    /**
     * methodName : 1305. All Elements in Two Binary Search Trees [Medium]
     * author : Jihun Park
     * description : https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
     * @param root1
     * @param root2
     * @return list
     */
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> sortedList1 = new ArrayList<>();
        List<Integer> sortedList2 = new ArrayList<>();
        // inorder-traversal
        inOrder(root1,sortedList1);
        inOrder(root2,sortedList2);

        // merge 2 sortedList
        List<Integer> result = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < sortedList1.size() && idx2 < sortedList2.size() ){ //둘다 유효할 때만 반
            if(sortedList1.get(idx1) <= sortedList2.get(idx2)){
                result.add(sortedList1.get(idx1++));
            }else{
                result.add(sortedList2.get(idx2++));
            }
        }
        while(idx1 < sortedList1.size()) result.add(sortedList1.get(idx1++));
        while(idx2 < sortedList2.size()) result.add(sortedList2.get(idx2++));

        return result;
    }


    private void preOrder(TreeNode tree, List<Integer> result){ // 전위 순회 root left right
        if(tree == null) return;
        result.add(tree.val);
        preOrder(tree.left,result);
        preOrder(tree.right,result);
    }
    private void inOrder(TreeNode tree, List<Integer> result){ // 중위순회 left root right
        if(tree == null) return;
        inOrder(tree.left,result);
        result.add(tree.val);
        inOrder(tree.right,result);
    }
    private void postOrder(TreeNode tree, List<Integer> result){ // 후위순회 left right root
        if(tree == null) return;
        postOrder(tree.left,result);
        postOrder(tree.right,result);
        result.add(tree.val);
    }


    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        pushLeft(root1, st1);
        pushLeft(root2, st2);

        while (!st1.isEmpty() || !st2.isEmpty()) {
            Stack<TreeNode> st = st2.isEmpty() || !st1.isEmpty() && st1.peek().val < st2.peek().val ? st1 : st2;
            TreeNode node = st.pop();
            list.add(node.val);
            pushLeft(node.right, st);
        }

        return list;
    }

    private void pushLeft(TreeNode node, Stack<TreeNode> st) {
        while (node != null) {
            st.push(node);
            node = node.left;
        }
    }

}
