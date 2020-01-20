package org.sanket.algorithms.unionfind;

import org.sanket.algorithms.Algorithm;

public interface UnionFind extends Algorithm {
    void union(int target, int source);
    boolean isconnected(int target, int source);
}