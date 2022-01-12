package com.leetcode.medium;

import com.leetcode.core.Node;

/**
 * packageName    : com.leetcode.medium
 * fileName       : PopulatingNextRightPointersInEachNode
 * author         : Jihun Park
 * date           : 2022/01/13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/13        Jihun Park       최초 생성
 */
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        //1. dfs 재귀호출 감.
//        if(root == null) { return root;} // edge case
//        this.dfs(root.left,root.right); // 전위순회하며 좌표 저장 & left right next로 1차 연결
//        return root;
//
//        //2. dfs 재귀호출2
//        if(root == null) return root;
//        this.dfs2(root);
//        return root;

        //3. 반복 처리
        if(root == null) return root;
        Node node = root;

        while(node.left != null){  // 2차원배열의 순환 같이 1depth씩 순차적으로 돌면서 처리
            Node prev = node;   // 이전 deapth의 첫번째 노드 기억
            while(node != null){ // 끝까지 와서 next가 null이면 다음 depth로
                node.left.next = node.right;
                if(node.next != null){
                    node.right.next = node.next.left;
                }
                node = node.next;
            }
            node = prev.left;
        }
        return root;

    }

    private void dfs(Node left, Node right){
        if(left == null || right ==null) return;
        left.next = right;
        dfs(left.left,left.right);
        dfs(left.right,right.left);
        dfs(right.left,right.right);
    }

    public void dfs2(Node node) {
        if(node == null || node.left == null) return;
        node.left.next = node.right;
        if(node.next != null) node.right.next = node.next.left;
        dfs2(node.left);
        dfs2(node.right);
    }
}
