package com.pk.leetcode;

import java.util.*;

public class _841_KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int roomsVisited = 0;
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty() && roomsVisited<rooms.size()){
            int roomIndex = q.poll();
            if (visited.contains(roomIndex))
                continue;
            visited.add(roomIndex);
            roomsVisited++;
            q.addAll(rooms.get(roomIndex));
        }

        return (roomsVisited==rooms.size());
    }
}
