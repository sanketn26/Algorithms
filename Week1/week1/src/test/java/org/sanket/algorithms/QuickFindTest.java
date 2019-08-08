package org.sanket.algorithms;

import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;
import org.sanket.algorithms.unionfind.QuickFind;
import org.sanket.algorithms.unionfind.UnionFind;

public class QuickFindTest{
    @Test
    public void implementsUnionFind(){
        UnionFind qf = new QuickFind(10);
        assertTrue(qf != null);
    }

    public void checkInitiatlization(){
        QuickFind qf = new QuickFind(10);
        int[] nodes = qf.getNodes();
        for(int i = 0; i < 10; i++){
            if(nodes[i] != i){
                assertTrue(False);
                break;
            }
        }
        assertTrue(True);
    }

}