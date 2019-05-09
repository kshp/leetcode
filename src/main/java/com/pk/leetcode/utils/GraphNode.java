package com.pk.leetcode.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.Map;

public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {}

    public GraphNode(int _val,List<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public static Boolean isClonedGraph (GraphNode graphNode1, GraphNode graphNode2, Map<GraphNode, Boolean> cache){
        if (graphNode1 == graphNode2)
            return false;

        if (cache.containsKey(graphNode1))
            return cache.get(graphNode1);

        if (graphNode1.val != graphNode2.val)
            return false;

        if (graphNode1.neighbors == graphNode2.neighbors)
            return false;

        if (graphNode1.neighbors.size()!= graphNode2.neighbors.size())
            return false;

        cache.put(graphNode1, Boolean.TRUE);

        for (int i=0; i<graphNode1.neighbors.size(); i++){
            Boolean result = isClonedGraph(graphNode1.neighbors.get(i), graphNode2.neighbors.get(i), cache);
            if (!result)
                return result;
        }

        return true;
    }
}
