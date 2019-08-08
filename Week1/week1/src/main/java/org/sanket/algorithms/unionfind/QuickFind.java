package org.sanket.algorithms.unionfind;

import org.sanket.algorithms.unionfind.UnionFind;

public class QuickFind implements UnionFind {
    private int[] nodes;
    private int nodeSize;

    public QuickFind(int nodeSize){
        nodes = new int[nodeSize];
        this.nodeSize = nodeSize;
        for(int i = 0; i < nodeSize; i++){
            nodes[i] = i;
        }
    }

    public int[] getNodes(){
        return nodes;
    }

    @Override
    public void union(int target, int source) {
        int val_at_target = nodes[target];
        int val_at_source = nodes[source];
        for(int i = 0; i < nodeSize; i++){
            if(nodes[i] == val_at_target)
                nodes[i] = val_at_source;
        }
    }

    @Override
    public boolean isconnected(int target, int source) {
        return nodes[target] == nodes[source];
    }

}