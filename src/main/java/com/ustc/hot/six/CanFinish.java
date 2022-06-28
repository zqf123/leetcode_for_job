package com.ustc.hot.six;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/13 16:32
 */

public class CanFinish {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1,0},{0,1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }
    static List<List<Integer>> edges;
    static int[] visited;
    static boolean valid = true;
    public static boolean canFinish(int numCourses,int[][] prerequisites){
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
            System.out.println(edges);
        }
        visited = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            System.out.println(edges);
        }
        for (int i = 0; i < numCourses && valid; i++) {
            if (visited[i] == 0)
                dfs(i);
        }
        return valid;
    }
    public static void dfs(int u){
        visited[u] = 1;
        for (Integer v : edges.get(u)) {
            if (visited[v] == 0){
                dfs(v);
                if (!valid)
                    return;
            }else if (visited[v] == 1){
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }
}
