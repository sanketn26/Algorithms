package org.sanket.algorithms.unionfind;

public class WeightedQuickUnion implements UnionFind {

    private int[] nodes;
    private int[] sizes;

    public WeightedQuickUnion(int nodeSize){
        nodes = new int[nodeSize];
        sizes = new int[nodeSize];
        for(int i = 0; i < nodeSize; i++){
            nodes[i] = i;
            sizes[i] = 0;
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
        if (root_Source == root_target) return;
        if(sizes[root_target] < sizes[root_Source]){
            nodes[root_target] = root_Source;
            sizes[root_Source] += sizes[root_target];
        }
        else{
            nodes[root_Source] = root_target;
            sizes[root_target] += sizes[root_Source];
        }
        
    }

    public boolean isconnected(int target, int source){
        return getRoot(target) == getRoot(source);
    }

    @Override
    public String getName() {
        return "WeightedQuickUnion";
    }

    @Override
    public void execute() {

    }
}