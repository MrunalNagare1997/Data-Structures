package PracticeGraph;

import java.util.Scanner;

public class Implementation_Graph_Using_Adjacency_List {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int vertices;
        System.out.println("Enter the number of vertices in the graph...");
        vertices=sc.nextInt();

        GraphUsingAdjavencyList graph1=new GraphUsingAdjavencyList(vertices);

        graph1.addEdge(1,4);
        graph1.addEdge(2,4);
        graph1.addEdge(1,3);
        graph1.addEdge(2,5);
        graph1.addEdge(1,1);

        graph1.printGraph();

    }

}
