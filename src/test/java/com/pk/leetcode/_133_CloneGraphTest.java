package com.pk.leetcode;

import com.pk.leetcode.utils.GraphNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class _133_CloneGraphTest {

    private GraphNode graphNode1;

    @Before
    public void init(){
        graphNode1 = new GraphNode(1, new ArrayList<>());

        GraphNode graphNode2 = new GraphNode(2, new ArrayList<>());

        GraphNode graphNode3 = new GraphNode(3, new ArrayList<>());

        GraphNode graphNode4 = new GraphNode(4, new ArrayList<>());

        graphNode1.neighbors.add(graphNode2);
        graphNode1.neighbors.add(graphNode4);

        graphNode2.neighbors.add(graphNode1);
        graphNode2.neighbors.add(graphNode3);

        graphNode3.neighbors.add(graphNode2);
        graphNode3.neighbors.add(graphNode4);

        graphNode4.neighbors.add(graphNode1);
        graphNode4.neighbors.add(graphNode3);
    }

    @Test
    public void cloneGraph() {
        _133_CloneGraph instance = new _133_CloneGraph();
        GraphNode graphNode = instance.cloneGraph(this.graphNode1);
        assertTrue(GraphNode.isClonedGraph(graphNode1, graphNode, new HashMap<>()));
    }
}