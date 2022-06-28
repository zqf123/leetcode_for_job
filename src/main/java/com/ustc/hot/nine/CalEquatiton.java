package com.ustc.hot.nine;

import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 9:35
 */
//399.除法求值
public class CalEquatiton {
    public static void main(String[] args) {

    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries){
        int equationSize = equations.size();

        UnionFind unionFind = new UnionFind(2*equationSize);
        return new double[0];
    }

    private class UnionFind{
        private int[] parent;
        //指向父节点的权值
        private double[] weight;
        public UnionFind(int n){
            this.parent = new int[n];
            this.weight = new double[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                weight[i] = 1.0d;
            }
        }
        public void union(int x,int y,double value){
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY)
                return;
            parent[rootX] = rootY;
            weight[rootX] = weight[y]*value / weight[x];
        }
        //路径压缩
        public int find(int x){
            if (x != parent[x]){
                int origin = parent[x];
                parent[x] = find(parent[x]);
                weight[x] *= weight[origin];
            }
            return parent[x];
        }
        public double isConnected(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY)
                return weight[x] / weight[y];
            else
                return -1.0d;
        }
    }
}
