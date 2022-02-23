package com.leetcode.graph;

import com.leetcode.core.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * packageName    : com.leetcode.graph
 * fileName       : 133. Clone Graph
 * author         : Jihun Park
 * date           : 2022/02/23
 * description    : https://leetcode.com/problems/clone-graph/
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/02/23        Jihun Park       최초 생성
 */
public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        map.put(node, new UndirectedGraphNode(node.val));
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            UndirectedGraphNode cur = q.poll();
            for(UndirectedGraphNode neighbor : cur.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new UndirectedGraphNode(neighbor.val));
                    q.offer(neighbor);
                }
                map.get(cur).neighbors.add(map.get(neighbor));
            }

        }
        return map.get(node);
    }

}
