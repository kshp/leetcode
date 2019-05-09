package com.pk.leetcode;

import com.pk.leetcode.utils.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _133_CloneGraph {
    public GraphNode cloneGraph(GraphNode node) {
        if (node == null)
            return node;

        return cloneNode(node, new HashMap<>());
    }

    private GraphNode cloneNode(GraphNode node, Map<Integer, GraphNode> visited) {
        if (node == null) return null;

        if (visited.containsKey(node.val))
            return visited.get(node.val);

        GraphNode clone = new GraphNode(node.val, new ArrayList<>());
        visited.put(clone.val, clone);

        if (node.neighbors == null) {
            return clone;
        }

        for (GraphNode neighbor : node.neighbors)
            clone.neighbors.add(cloneNode(neighbor, visited));

        return clone;
    }
}
