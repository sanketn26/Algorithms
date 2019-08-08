package org.sanket.algorithms.unionfind;

import org.sanket.algorithms.unionfind.UnionFind;

public class QuickFind implements UnionFind {
    private int[] nodes;

    public QuickFind(int nodeSize){
        nodes = new int[nodeSize];
        for(int i = 0; i < nodeSize; i++){
            nodes[i] = i;
        }
    }

    public int[] getNodes(){
        return nodes;
    }

}