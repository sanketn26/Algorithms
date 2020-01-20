package org.sanket.algorithms;

import java.util.Scanner;

import org.sanket.algorithms.unionfind.QuickFind;
import org.sanket.algorithms.unionfind.QuickUnion;
import org.sanket.algorithms.unionfind.WeightedQuickUnion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlgorithmContainer container = new AlgorithmContainer();
        container.registerAlgorithm(new QuickFind(10));
        container.registerAlgorithm(new QuickUnion(10));
        container.registerAlgorithm(new WeightedQuickUnion(10));

        System.out.println("Algorithms available:");
        for (String algoName : container.getAlgoNames()) {
            System.out.println(algoName);
        }
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Please enter the algorithm name:");
            String algoName = in.nextLine();
            System.out.println("Executing: " + algoName);
            container.getAlgorithm(algoName).execute();
        }
    }
}
