package com.leetcode.medium;

/**
 * packageName    : com.leetcode.challenge.may
 * fileName       : SortedListToBST
 * author         : Jihun Park
 * date           : 2021/05/07
 * description    : Convert Sorted List to Binary Search Tree
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/05/07        Jihun Park       최초 생성
 */
public class SortedListToBST {

    /**
    Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
    For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

    Example 1: https://assets.leetcode.com/uploads/2020/08/17/linked.jpg
    Input: head = [-10,-3,0,5,9]
    Output: [0,-3,9,-10,null,5]
    Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

    Example 2:
    Input: head = []
    Output: []

    Example 3:
    Input: head = [0]
    Output: [0]

    Example 4:
    Input: head = [1,3]
    Output: [3,1]


    Constraints:
    The number of nodes in head is in the range [0, 2 * 104].
            -10^5 <= Node.val <= 10^5
*/
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    ListNode curr;

    public TreeNode sortedListToBST(ListNode head) {
        int count = 0;
        curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        curr = head;
        return treeify(1, count);
    }

    private TreeNode treeify(int i, int j) {
        
        if (j < i) return null;
        int mid = i + j >> 1;
        
        TreeNode node = new TreeNode();
        node.left = treeify(i, mid - 1);
        node.val = curr.val;
        curr = curr.next;
        node.right = treeify(mid + 1, j);
        return node;
    }
/*
    Idea:
    In order to build a height-balanced binary tree, we need to ensure that roughly half of the total number of nodes are on either side of the root, and the only way to know what half of the total number of nodes is requires finding the total number of nodes first.

    With this in mind, one easy solution would be to convert the linked list to an array, then we have handy access not only to the total length of the array, but also index-access to the node values, as well. At that point, we could define a recursive helper to build a tree from the middle node, recursively calling itself to build subtrees from the nodes on the left and right of the middle node. This option would take an extra O(N) space to complete.

    Should we not want to use up that much extra space, we could instead keep the linked list and lose the index-access nature of the array, using Floyd's Cycle Detection Algorithm to easily find the middle node on each recursion step. This would, however, require iterating through parts of the linked list repeatedly, driving the time complexity from O(N) to O(N log N).

    But we can do even better: We can complete this problem in O(N) time with only O(log N) extra space (in excess of the output space).

    First, we'll have to iterate once through the linked list to count the total number of nodes (count). Then, we can define our recursive helper (treeify())using index numbers as our arguments. Even though we won't be able to access the listnodes directly by index number, we can take advantage of an inorder tree traversal to force our access to go in iterative order.

    We'll need to have our list pointer (curr) have global scope in order to update properly via recursion. In an inorder traversal, we recursively process the left subtree, then process the middle node, then recursively process the right subtree. For this solution, we'll just need to make sure we move curr to curr.next at the end of processing the middle node.

    We can then return the full tree built by our recursive helper.

    Time Complexity: O(N) where N is the length of the linked list
    Space Complexity: O(log N) in excess of the space needed for the input/output, due to the recursion stack
    */


}
