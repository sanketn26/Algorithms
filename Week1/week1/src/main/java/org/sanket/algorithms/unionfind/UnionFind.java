package org.sanket.algorithms.unionfind;

public interface UnionFind {
    void union(int target, int source);
    boolean isconnected(int target, int source);
}