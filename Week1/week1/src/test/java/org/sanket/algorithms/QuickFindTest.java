package org.sanket.algorithms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.sanket.algorithms.unionfind.QuickFind;
import org.sanket.algorithms.unionfind.UnionFind;

public class QuickFindTest{
    @Test
    public void implementsUnionFind(){
        UnionFind qf = new QuickFind(10);
        assertTrue(qf != null);
    }

    @Test
    public void checkInitiatlization(){
        QuickFind qf = new QuickFind(10);
        int[] nodes = qf.getNodes();
        for(int i = 0; i < 10; i++){
            if(nodes[i] != i){
                assertTrue(false);
                break;
            }
        }
        assertTrue(true);
    }

    @Test
    public void unionFindTest(){
        UnionFind uf = new QuickFind(10);
        uf.union(0, 1);
        uf.union(2, 3);
        uf.union(2, 0);
        uf.union(4, 7);
        uf.union(8, 5);
        uf.union(6, 4);
        uf.union(4, 9);
        assertTrue(uf.isconnected(7, 9));
        assertTrue(uf.isconnected(0, 3));
        assertTrue(uf.isconnected(8, 5));
        assertTrue(!uf.isconnected(5, 9));
    }
}