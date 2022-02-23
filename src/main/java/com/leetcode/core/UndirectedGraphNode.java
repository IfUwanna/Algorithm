package com.leetcode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.leetcode.graph
 * fileName       : Node
 * author         : Jihun Park
 * date           : 2022/02/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/23        Jihun Park       최초 생성
 */
public class UndirectedGraphNode {
    public int val;
    public List<UndirectedGraphNode> neighbors;
    public UndirectedGraphNode() {
        val = 0;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
    public UndirectedGraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
    public UndirectedGraphNode(int _val, ArrayList<UndirectedGraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
