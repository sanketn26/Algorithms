package org.sanket.algorithms.unionfind;

public class QuickUnion implements UnionFind {

    private int[] nodes;

    public QuickUnion(int nodeSize){
        nodes = new int[nodeSize];
        for(int i = 0; i < nodeSize; i++){
            nodes[i] = i;
        }
    }

    private int getRoot(int node){
        while(node != nodes[node])
            node = nodes[node];
        return node;
    }


    public void union(int target, int source){
        int root_target = getRoot(target);
        int root_Source = getRoot(source);
        nodes[root_target] = root_Source;
    }

    public boolean isconnected(int target, int source){
        return getRoot(target) == getRoot(source);
    }

    @Override
    public String getName() {
        return "QuickUnion";
    }

    @Override
    public void execute() {

    }
}